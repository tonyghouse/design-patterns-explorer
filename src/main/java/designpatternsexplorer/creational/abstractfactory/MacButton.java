package designpatternsexplorer.creational.abstractfactory;

public class MacButton implements Button {
    @Override
    public void renderButton(){
        System.out.println("Rendering Mac Button");
    }

}
