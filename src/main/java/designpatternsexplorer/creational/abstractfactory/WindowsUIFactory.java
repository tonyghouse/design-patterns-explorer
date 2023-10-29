package designpatternsexplorer.creational.abstractfactory;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
