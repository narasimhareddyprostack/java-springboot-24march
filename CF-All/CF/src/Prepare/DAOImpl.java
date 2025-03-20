package Prepare;
@FunctionalInterface
interface  DAOInterface{
    public abstract void login();

}
public class DAOImpl {
    public static void main(String[] args) {
    DAOInterface obj=()->{
                      System.out.println("Login Success");
                     };
    obj.login();
    }
}
