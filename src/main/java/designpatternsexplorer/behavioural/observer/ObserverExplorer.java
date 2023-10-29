package designpatternsexplorer.behavioural.observer;


/*

 */
public class ObserverExplorer {
    // Behavioral design pattern


    public static void explore(){
        System.out.println("Observer Explorer");
        NewsAgency newsAgency = new NewsAgency();

        //setting observers
        newsAgency.addNewsChannel(new IndiaTVNewsChannel());
        newsAgency.addNewsChannel(new NdtvNewsChannel());

        newsAgency.broadcastNews("PM visiting greece");
        newsAgency.broadcastNews("Oscar award announcement");


    }

}
