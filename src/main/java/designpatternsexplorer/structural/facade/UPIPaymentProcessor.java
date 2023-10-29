package designpatternsexplorer.structural.facade;

public class UPIPaymentProcessor {
    private int phoneNumber;

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
