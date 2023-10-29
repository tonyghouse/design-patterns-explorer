package designpatternsexplorer.creational.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void renderButton(){
        System.out.println("Rendering Windows Button");
    }
}
