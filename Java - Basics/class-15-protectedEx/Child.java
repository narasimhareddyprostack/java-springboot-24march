package pack2;
import pack1.Parent;
public class Child extends Parent{
    public void m4(){
        System.out.println("Child class - m4 public method");
    }
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.m1();
        //p1.m3();  
       Child c1=new Child();
       c1.m4();
       c1.m1();
       c1.m3();
}
}
