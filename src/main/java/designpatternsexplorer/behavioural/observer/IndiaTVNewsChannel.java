package designpatternsexplorer.behavioural.observer;

public class IndiaTVNewsChannel implements  NewsChannel{
    @Override
    public void showNews(String news) {
        System.out.println("IndiaTV: "+news);
    }
}
