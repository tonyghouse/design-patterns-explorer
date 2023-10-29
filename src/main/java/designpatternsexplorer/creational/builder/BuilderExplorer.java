package designpatternsexplorer.creational.builder;

/*

 */

public class BuilderExplorer {
    // Structural design pattern

    public static void explore(){
        System.out.println("Builder Explorer");
        Burger burger = new Burger.BurgerBuilder().size("large").build();
        System.out.println("burger : "+burger);
    }
}
