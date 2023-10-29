package designpatternsexplorer.structural.facade;

public class DebitCardPaymentProcessor {
    private int accountNumber;

    private int balance;


    public int getBalance(){
        return this.balance;
    }
    public boolean transferBalance(int receiverAccNumber, int amount){
        //implementation
        return true;
    }

    public boolean closeAccount(){
        //implementation
        return true;
    }
}
