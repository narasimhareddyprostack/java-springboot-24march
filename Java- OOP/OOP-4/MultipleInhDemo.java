interface DaoI{
    public abstract void login();
    public abstract void logout();
}
interface UserI{
    public abstract void forgetPwd();
}
class User implements DaoI,UserI{
    public void login(){}
    public void logout(){}
    public void forgetPwd(){}
}
public class MultipleInhDemo {
    public static void main(String[] args) {
        User obj=new User();
    }
}
