package lazarus.MahoganyHomes;

import lazarus.Framework.Branch;
import lazarus.Framework.Leaf;
import org.powbot.api.rt4.walking.model.Skill;
import org.powbot.api.script.AbstractScript;
import org.powbot.api.script.OptionType;
import org.powbot.api.script.ScriptConfiguration;
import org.powbot.api.script.ScriptManifest;
import org.powbot.api.script.paint.Paint;
import org.powbot.api.script.paint.PaintBuilder;
import org.powbot.mobile.service.ScriptUploader;

import java.util.ArrayList;
import java.util.List;

@ScriptManifest(
        name = "Lazarus Mohagony Homes",
        description = "Completes mohagony homes",
        version = "0.0.1"
)
@ScriptConfiguration.List(
        {
                @ScriptConfiguration(
                        name = "Select tier",
                        description = "What tier homes would you like to complete",
                        defaultValue = "Expert(70)",
                        allowedValues = {"Beginner", "Novice(20)", "Adept(50)", "Expert(70)"},
                        optionType = OptionType.STRING
                ),
                @ScriptConfiguration(
                        name = "Use NPC Contact?",
                        description = "Enable this to use NPC Contact",
                        optionType = OptionType.BOOLEAN,
                        defaultValue = "true"
                )
        }
)

public class MohagonyHomes extends AbstractScript {

    public List<Branch> branches = new ArrayList<>();
    String leafStatus = "none";
    String branchStatus = "none";

    public static void main(String[] args) {
        new ScriptUploader().uploadAndStart("Laz Mohagony Homes", "Lazarus", "127.0.0.1:5555", true, true);
    }

    @Override
    public void onStart() {
        Paint p = new PaintBuilder()
                .trackSkill(Skill.Construction)
                .addString(() -> "Last leaf: ", () -> leafStatus)
                .addString(() -> "Current Contract: ", () -> Configs.CurrentContract)
                .x(30)
                .y(65)
                .build();
        addPaint(p);

//        branches.add(
//
//        ));
    }

    @Override
    public void poll() {

        for (Branch branch : branches) {
            if (branch.validate()) {
                branchStatus = branch.status();
                for (Leaf leaf : branch.leaves) {
                    if (leaf.validate()) {
                        leafStatus = leaf.status();
                        System.out.println(leafStatus);
                        leaf.execute();
                    }
                }
            }
        }

    }
}