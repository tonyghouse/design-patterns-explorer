package designpatternsexplorer.creational.factory;

public class WindowsOS implements OperatingSystem {
    @Override
    public void showTerminal() {
        System.out.println("Windows Command Prompt >>> ");
    }
}
