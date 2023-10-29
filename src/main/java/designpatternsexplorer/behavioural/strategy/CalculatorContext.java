package designpatternsexplorer.behavioural.strategy;

public class CalculatorContext {

    OperationStrategy operationStrategy;


    public CalculatorContext(OperationStrategy operationStrategy){
        this.operationStrategy = operationStrategy;
    }

    public int executeStrategy(int x, int y){
       return operationStrategy.performOperation(x,y);
    }


}
