class Emp{}
public class Test {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;
        Emp e1=new Emp();
        Emp e2=new Emp();
        String s1="Rahul";
        String s2="Rahul";

        String s3=new String("Rahul");
        String s4=new String("Rahul");

        System.out.println(s3.equals(e1));
        System.out.println(s3 == e1);
    }
}
