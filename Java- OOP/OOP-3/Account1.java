public class Account1{
    int acc_Id;
    String acc_Name;
    public Account1(int aid,String name){
        this.acc_Id = aid;
        this.acc_Name=name;
    }
    public static void main(String[] args) {
       Account a1=new Account(101,"Rahul");
       System.out.println(a1.acc_Id); // 101
       System.out.println(a1.acc_Name); // Rahul
       System.out.println(a1); // Object Address Account@3fee733d
       
       Account a2= new Account(102, "Sonia");
       System.out.println(a1.acc_Name);
       System.out.println(a2.acc_Name);
    }
}
