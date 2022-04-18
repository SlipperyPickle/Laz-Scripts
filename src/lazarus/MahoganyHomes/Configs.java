package lazarus.MahoganyHomes;

import org.powbot.api.Area;
import org.powbot.api.Tile;
import org.powbot.api.rt4.GameObject;

import java.util.HashSet;
import java.util.Set;

public class Configs {

    public static String CurrentContract;
    public static String NextContract;

    public static final int[] FIST_DIALOG = {217, 6};
    public static final int[] SECOND_DIALOG = {231, 6};
    public static final int[] SELECT_CONTRACT = {219, 1};
    public static final int[] NEW_CONTRACT = {231, 6};
    public static final int[] SELECT_NPC = {75, 62};

    public static Area ArdougneNoellaArea = new Area(new Tile(2653, 3322, 0), new Tile(2660, 3318, 0));

    private static final Set<Integer> object1_ids = Set.of(
            39981, 39989, 39997, 40002, 40007, 40011, 40083, 40156, 40164, 40171, 40296, 40297
    );

    private static final Set<Integer> object2_ids = Set.of(
            39982, 39990, 39998, 40008, 40084, 40089, 40095, 40157, 40172, 40165, 40287, 40293
    );

    private static final Set<Integer> object3_ids = Set.of(
            39983, 39991, 39999, 40003, 40012, 40085, 40090, 40096, 40158, 40173, 40166, 40290
    );

    private static final Set<Integer> object4_ids = Set.of(
            39984, 39992, 40000, 40086, 40091, 40097, 40159, 40167, 40174, 40288, 40291, 40294
    );

    private static final Set<Integer> object5_ids = Set.of(
            39985, 39993, 40009, 40013, 40087, 40092, 40175, 40160, 40168, 40286, 40298, 40004
    );

    private static final Set<Integer> object6_ids = Set.of(
            39986, 39994, 40001, 40005, 40010, 40014, 40088, 40093, 40098, 40161, 40169, 40176
    );

    private static final Set<Integer> object7_ids = Set.of(
            39987, 39995, 40006, 40015, 40094, 40099, 40162, 40170, 40177, 40292, 40295
    );

    private static final Set<Integer> object8_ids = Set.of(
            39996, 39988, 40163, 40289, 40299
    );


    public final Set<GameObject> object1 = new HashSet<>();
    public final Set<GameObject> object2 = new HashSet<>();
    public final Set<GameObject> object3 = new HashSet<>();
    public final Set<GameObject> object4 = new HashSet<>();
    public final Set<GameObject> object5 = new HashSet<>();
    public final Set<GameObject> object6 = new HashSet<>();
    public final Set<GameObject> object7 = new HashSet<>();
    public final Set<GameObject> object8 = new HashSet<>();


    public static void setCurrentContract(String contract) {
        CurrentContract = contract;
    }


}
