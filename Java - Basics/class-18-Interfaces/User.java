interface UserI {
public void login();
abstract void logout();
void forgetPassword();
}
public class User implements UserI {
    public void login(){
        System.out.println("Login in Success");
    }
    public void logout(){
        System.out.println("Logout in Success");
    }
     void forgetPassword(){
        System.out.println("ForgetPassword -- Test Case");
    }
    public static void main(String[] args) {
       User u1=new User();
       u1.login();
       u1.forgetPassword();
       u1.logout();
    }
}
