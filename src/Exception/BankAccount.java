package Exception;
/*
public class BankAccount {
    private double amount;

    public BankAccount(double amount){
        this.amount = amount;
    }
    public void WithDraw(double amount) throws Exception {
        double balance = 0;
        if(amount > balance){
         throw new InSufficientFundsException(amount);
        }
        balance -= amount;
    }
}*/

public class BankAccount {
    private double amount;
    public BankAccount(double amount){
        this.amount = amount;
    }
    public void withDraw(int i)throws Exception{
        double balance = 0;
        if(amount > balance){
            throw  new InSufficientFundsException(amount);
        }
        balance -=amount;
    }
}