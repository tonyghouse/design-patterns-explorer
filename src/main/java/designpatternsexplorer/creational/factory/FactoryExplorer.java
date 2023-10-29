package designpatternsexplorer.creational.factory;


/*

 */
public class FactoryExplorer {
    // Creational design pattern

    //creates based on some requirements


    public static void explore(){
        System.out.println("Factory Explorer");
       OperatingSystem os =  OperatingSystemFactory.getInstance("mac");
       os.showTerminal();








    }

}
