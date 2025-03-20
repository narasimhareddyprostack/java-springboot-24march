package FIEx1;

import java.util.function.Function;
interface TestI{
    public abstract  int apply(String ename);
}

public class TestImplOne {
    public static void main(String[] args) {
        Function<String,Integer> obj1= ename->ename.length();
        TestI obj2= ename->ename.length();
        System.out.println(obj1.apply("Rahul"));
        System.out.println(obj2.apply("Sonia Gandhi"));
    }
}
