class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl_amount(int amount) throws InsuffientFundsException{
        int acc_Bal=50;
        if (acc_Bal>amount) {
            System.out.println("Go and Enjoy");
        } else {
            throw new InsuffientFundsException("Low Balance");
        }
    }
    public static void main(String[] args) throws InsuffientFundsException {
        Account a1  = new Account();
        a1.withdrawl_amount(15000);
    }
}