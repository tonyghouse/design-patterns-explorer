package designpatternsexplorer.creational.abstractfactory;


/*

 */
public class AbstractFactoryExplorer {
    // Creational design pattern

    //factory of factory design pattern


    public static void explore(){
        System.out.println("Abstract Factory Explorer");
        Page page = new Page(new WindowsUIFactory());
        page.renderPage();






    }

}
