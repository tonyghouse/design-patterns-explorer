package designpatternsexplorer.behavioural.strategy;

public class MultiplicationOperationStrategy implements OperationStrategy{
    @Override
    public int performOperation(int x, int y) {
        return x*y;
    }
}
