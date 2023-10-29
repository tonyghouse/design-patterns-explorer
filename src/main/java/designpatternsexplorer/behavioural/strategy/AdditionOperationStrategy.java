package designpatternsexplorer.behavioural.strategy;

public class AdditionOperationStrategy implements OperationStrategy{
    @Override
    public int performOperation(int x, int y) {
        return x+y;
    }
}
