package designpatternsexplorer.behavioural.observer;

public class NdtvNewsChannel implements  NewsChannel{
    @Override
    public void showNews(String news) {
        System.out.println("NDTV: "+news);
    }
}
