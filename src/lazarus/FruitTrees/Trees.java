package lazarus.FruitTrees;

public enum Trees {
    PAPAYA_TREE("Papaya tree", 8117);

    private final String treeName;
    private final int id;

    Trees(String name, int id) {
        this.treeName = name;
        this.id = id;
    }

    public String treeName() { return treeName; }
    public int id() { return id; }
}
