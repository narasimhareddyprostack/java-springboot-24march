package Prepare;
interface DAOI{
    public abstract  void login();
}
public class DAO implements  DAOI{
    public void login(){
        System.out.println("Login Success");
    }
    public static void main(String[] args) {
        DAOI obj= new DAO();
        obj.login();
    }
}
