package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // So scope here refers to the visibility of a class, member or variable.
        // So let's imagine you are gonna buy a particular computer, and you find a local store and
        // let's say it's got  the computer for 20% off, 20% discount.
        // Now the same computer in another store would still be at the full price, though.
        // So the scope, in other words, or the price reduction is just that one local store.

        // But, contrast that to a situation where you 've got a large company, and let's use Wal Mart as an example.
        // Wal Mart is huge company in the united states and say if they decided to discount a particular computer, so
        // the discount then would actually apply in about 4,500 stores across America.
        // So in that context the scope of the discount is therefore much much wider. And that actually asks what made
        // us a multi-national company, if they applied the discount world wide, the scope would be over 11,000 stores.
        // So the important thing here is that Walmart's discount does not apply to any other stores. So the scope is limited
        // to the stores controlled only by Walmart and the same with the local example the local store that had the 20% off.
        // The scope there is just for that one local store. So our java objects have got scope in much the same way.

        String privateVar = " this is private to main() ";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
        System.out.println("**************************************************************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
