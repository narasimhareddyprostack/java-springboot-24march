package FIEx1;

import java.util.function.Function;
@FunctionalInterface
interface FunI{
    public abstract  int apply(int num);
}
public class FunImpl3 {
    public static void main(String[] args) {
        Function<Integer,Integer> obj1= num->num*num;
        FunI obj2= num->num*num;
        System.out.println(obj1.apply(10));
        System.out.println(obj2.apply(10));
    }
}
