package designpatternsexplorer.structural.facade;

/*
    It is used to provide a simplified and unified interface to a set of interfaces in a subsystem.
    The primary goal of the Facade pattern is to encapsulate the complexity of a system and
    provide a higher-level, easier-to-use interface for clients.
    This simplifies client code, improves code readability,
    and reduces the dependency on the underlying subsystem.
 */
public class FacadeExplorer {
    // Structural design pattern

    // Subsystem - classes and interfaces that performs specific tasks
    // Facade - a simplified and high-level interface to the subsystem
    public static void explore(){
        System.out.println("Facade Explorer");

        //In Example facade is added only to access balance and not other functionalities
        BalanceCheckerFacade balanceCheckerFacade = new BalanceCheckerFacade();
        int balance = balanceCheckerFacade.getBalance("upi");
        System.out.println("balance: "+balance);

    }

}
