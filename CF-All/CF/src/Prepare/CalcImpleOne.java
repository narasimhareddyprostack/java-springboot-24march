package Prepare;

interface  CalcIOne{
    public abstract  int sum(int a,int b);
}
public class CalcImpleOne implements  CalcIOne{
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        CalcIOne obj=new CalcImpleOne();
        System.out.println(obj.sum(10,20));
    }
}
