package lazarus.FruitTrees.Branches.HandlePatch;

import lazarus.Framework.Branch;

public class HandlePatch extends Branch {
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public String status() {
        return "Handle patch";
    }
}
