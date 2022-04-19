package lazarus.FruitTrees.Branches.Bank;

import lazarus.Framework.Branch;

public class Bank extends Branch {
    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public String status() {
        return "Banking";
    }
}
