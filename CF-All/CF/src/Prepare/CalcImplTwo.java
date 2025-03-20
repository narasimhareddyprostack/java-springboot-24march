package Prepare;

interface CalcITwo{
    public abstract  int sum(int a, int b);
}
public class CalcImplTwo {
    public static void main(String[] args) {
        CalcITwo obj = (a,b)->a+b;
        System.out.println(obj.sum(10,20));
    }
}
