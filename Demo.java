
// Nested class
// Example of local inner class
class Mom {
    class Baby {

    }
}

class Stranger {

}

// Normal extends
class SugarDaddy {
    public void patPat() {
        System.out.println("pat pat pat");
    }

    public String giveMoney(int money) {
        return "give you" + money + "money";
    }
}

// SugarOppa can only be used in Korea !
class SugarOppa extends SugarDaddy { // <- sugar daddy but korean
    @Override
    public String giveMoney(int money) {
        return "give you" + money + " money but Won";
    }
}

// -------------------------------------------------------------------
interface NotFamilyPlanningInterface {
    void firstChild();

    void secondChild();

    void thirdChild();
}

@FunctionalInterface
interface FamilyPlanningInterface {
    void singlecChild();
    // void stepChild(); //WONT COMPILE!
    // Object clone(); //WON't COMPILE!

    // a family is still an Object
    String toString();

    boolean equals(Object obj);
}

interface AncientMaleAsian {
    void noStepChild();
}

interface AncientParentsInLaw {
    void noStepChild();
}

@FunctionalInterface
interface NoChildMom extends AncientMaleAsian {
    // void yourChild(); //WON't COMPILE
}

// @FunctionalInterface
// interface BeingSingle { } //INVALID

public class Demo {

    public static void main(String... args) {
    }

    public static void demoAnonymous() {
        // anonymous demo
        SugarDaddy sugarOppa1 = new SugarDaddy() {
            public void giveMoney() {
                System.out.println("give you money but Won");
            }
        };

        SugarOppa sugarOppa2 = new SugarOppa();

        // They are the same
        System.out.println(sugarOppa1.giveMoney(2));
        System.out.println(sugarOppa2.giveMoney(2));
    }

    public static void demoFunctionalInterface() {

    }

    @FunctionalInterface
    interface sugarDaddyButInterface {
        String givemoney(int money);
    }

    public static void demoLambda() {
        // normally
        sugarDaddyButInterface sugarOppa = new sugarDaddyButInterface() {

            @Override
            public String givemoney(int money) {
                return "give you money" + money + "but Won";
            }
        };
        // with lambda
        sugarOppa = (money) -> ("give you" + money + " money but Won");
        // another choice
        sugarOppa = money -> "give you" + money + " money but Won";
        // sugarOppa = (money, name) -> ("give you" + money + " money but Won");
        // //another way but can't compile in here

        sugarDaddyButInterface poorSugarOppa = (money) -> {
            if (money < 100)
                return ("give you" + money + " money but Won");
            else
                return "I'm poor sr";
        };
    }
}
