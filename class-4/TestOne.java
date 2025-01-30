class Test{
    public static void main(String[] args) {
       Test t1=new Test();
       t1.login();
       t1.logout();
    }   
    public void login(){
        System.out.println("Login Success!");
    }
    public void logout(){
        System.out.println("Logout Success!");
    }
}