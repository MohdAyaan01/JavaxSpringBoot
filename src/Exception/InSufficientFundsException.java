package Exception;
//
//public class InSufficientFundsException extends Exception{
//    private double amount;
//    public InSufficientFundsException(double amount){
//        super("What Do You Want? You Don't Have Money....");
//        this.amount = amount;
//    }
//    public double getAmount(){
//        return amount;
//    }
//}

public class InSufficientFundsException extends Exception {
    private double amount;
    public InSufficientFundsException(double amount){
        super("no money ");
        this.amount = amount;
    }
    private double getAmount(){
        return amount;
    }
}