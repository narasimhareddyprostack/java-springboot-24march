interface Bank{
    public static final int min_Bal=500;
}
class Account implements Bank{
   
    public static void main(String[] args) {
        min_Bal = 600;
        System.out.println(min_Bal);
        System.out.println(Account.min_Bal);
    }
}