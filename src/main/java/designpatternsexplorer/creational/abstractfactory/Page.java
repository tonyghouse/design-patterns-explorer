package designpatternsexplorer.creational.abstractfactory;

//acts as a factory
public class Page {

    private  Button button;

    public Page(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
    }

    public void renderPage(){
        System.out.println("| Rendering Page |");
        button.renderButton();
    }

}
