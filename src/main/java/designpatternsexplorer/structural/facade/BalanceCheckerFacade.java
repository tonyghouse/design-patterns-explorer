package designpatternsexplorer.structural.facade;

public class BalanceCheckerFacade {

    CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();

    DebitCardPaymentProcessor debitCardPaymentProcessor = new DebitCardPaymentProcessor();

    UPIPaymentProcessor upiPaymentProcessor = new UPIPaymentProcessor();


    //only getBalance() is given access other methods are not
    public int getBalance(String accType) {

        if ("credit".equals(accType)) {
            return creditCardPaymentProcessor.getBalance();
        }

        if ("debit".equals(accType)) {
            return debitCardPaymentProcessor.getBalance();
        }

        if ("upi".equals(accType)) {
            return upiPaymentProcessor.getBalance();

        }

        return 0;

    }

}
