package lazarus.FruitTrees;

import com.google.common.eventbus.Subscribe;
import lazarus.Framework.Branch;
import lazarus.Framework.Leaf;
import lazarus.MahoganyHomes.Configs;
import org.powbot.api.Color;
import org.powbot.api.Textable;
import org.powbot.api.event.RenderEvent;
import org.powbot.api.rt4.GameObject;
import org.powbot.api.rt4.Objects;
import org.powbot.api.rt4.stream.locatable.interactive.GameObjectStream;
import org.powbot.api.rt4.walking.model.Skill;
import org.powbot.api.script.AbstractScript;
import org.powbot.api.script.OptionType;
import org.powbot.api.script.ScriptConfiguration;
import org.powbot.api.script.ScriptManifest;
import org.powbot.api.script.paint.Paint;
import org.powbot.api.script.paint.PaintBuilder;
import org.powbot.api.script.paint.TextPaintItem;
import org.powbot.mobile.drawing.Graphics;
import org.powbot.mobile.drawing.Rendering;
import org.powbot.mobile.service.ScriptUploader;

import java.util.ArrayList;
import java.util.List;

@ScriptManifest(
        name = "Lazarus Fruit Trees",
        description = "Completes a fruit tree run",
        version = "0.0.1"
)

public class FruitTrees extends AbstractScript {

    public List<Branch> branches = new ArrayList<>();
    String leafStatus = "none";
    String branchStatus = "none";
    GameObjectStream withingGnome;
    GameObjectStream tree;

    public static void main(String[] args) {
        new ScriptUploader().uploadAndStart(
                "Fruit Trees",
                "Lazarus",
                "127.0.0.1:5555",
                true,
                true);
    }

    @Override
    public void onStart() {
        Paint p = new PaintBuilder()
                .trackSkill(Skill.Farming)
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

    @Subscribe
    public void onRender(RenderEvent evt){
        //Graphics g = evt.getGraphics();
        Rendering.setScale(1.0f);
        Rendering.setColor(Color.getBLACK());
//        if(tree.first()!=null && tree.first().inViewport()){
//            tree.first().draw();
//        }
        String s = tree.first().actions().get(0);
        Rendering.drawString(s, tree.first().basePoint().getX(), tree.first().basePoint().getY());
//        Rendering.drawString(s, tree.first().localX(), tree.first().localY());

    }

    @Override
    public void poll() {
        tree = Objects.stream().within(Config.TreeGnomeStronghold).id(8117);

//        for (Branch branch : branches) {
//            if (branch.validate()) {
//                branchStatus = branch.status();
//                for (Leaf leaf : branch.leaves) {
//                    if (leaf.validate()) {
//                        leafStatus = leaf.status();
//                        System.out.println(leafStatus);
//                        leaf.execute();
//                    }
//                }
//            }
//        }
    }
}