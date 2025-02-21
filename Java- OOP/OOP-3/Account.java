public class Account{
    int acc_Id;
    String acc_Name;
    private double acc_Bal;
    public Account(int aid,String name){
        this.acc_Id = aid;
        this.acc_Name=name;
    }
    public void set_Acc_Bal(double bal){
        this.acc_Bal = this.acc_Bal+bal;
    }
    public double get_Acc_Bal(){
        return this.acc_Bal;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal - 500);
    }
    public static void main(String[] args) {
       Account a1=new Account(101,"Rahul");
      a1.set_Acc_Bal(5000.50);
      a1.set_Acc_Bal(50.10);

       Account a2= new Account(102, "Sonia");
       a2.set_Acc_Bal(6000.60);
       a2.set_Acc_Bal(600.10);
       System.out.println("Calculating");
       System.out.println("Balance - "+a1.get_Acc_Bal());
       System.out.println("Balance - "+a2.get_Acc_Bal());

       System.out.println("Balances");
       a1.cal_Bal();
       a2.cal_Bal();
    }
}
