package designpatternsexplorer.creational.abstractfactory;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
