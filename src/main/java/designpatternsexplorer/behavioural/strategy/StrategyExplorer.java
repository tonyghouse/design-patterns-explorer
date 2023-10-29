package designpatternsexplorer.behavioural.strategy;


import designpatternsexplorer.behavioural.observer.IndiaTVNewsChannel;
import designpatternsexplorer.behavioural.observer.NdtvNewsChannel;
import designpatternsexplorer.behavioural.observer.NewsAgency;

/*
   Strategy Pattern is used to define a family of algorithms,
    encapsulate each one of them, and make them interchangeable
 */
public class StrategyExplorer {
    // Behavioral design pattern


    public static void explore(){
        System.out.println("Observer Explorer");
    CalculatorContext calculatorContext =new CalculatorContext(new MultiplicationOperationStrategy());
        int result = calculatorContext.executeStrategy(1, 3);
        System.out.println("result : "+result);


    }

}
