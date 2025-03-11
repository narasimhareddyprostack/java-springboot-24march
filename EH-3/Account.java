class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}
public class Account{
    public void withdrawl_amount(int amount) {
        int acc_Bal=50;
        try{
            if (acc_Bal>amount) {
                System.out.println("Go and Enjoy");
            } else {
                throw new InsuffientFundsException("Low Balance");
            }
        }
        catch(InsuffientFundsException ie){
            System.out.println(ie.getMessage());
        }
       
    }
    public static void main(String[] args)  {
        Account a1  = new Account();
        a1.withdrawl_amount(15000);
    }
}