package designpatternsexplorer.creational.factory;

public class MacOS implements OperatingSystem {
    @Override
    public void showTerminal() {
        System.out.println("Mac OS Terminal >>> ");
    }
}
