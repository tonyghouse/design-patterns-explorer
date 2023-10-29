package designpatternsexplorer.behavioural.observer;


import java.util.ArrayList;
import java.util.List;

//Observerable
public class NewsAgency {

    private String news;

    private List<NewsChannel> newsChannels = new ArrayList<>();

    public void addNewsChannel(NewsChannel newsChannel){
        this.newsChannels.add(newsChannel);
    }


    public void broadcastNews(String news){
        this.news=news;

        for(NewsChannel newsChannel: newsChannels){
            newsChannel.showNews(news);

        }
    }




}
