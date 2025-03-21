package FIEx3;

import java.util.function.Predicate;

public class PredicateEx3 {
    public static void main(String[] args) {
        Predicate<String> p = ename->ename.length()>5;
        System.out.println(p.test("Rahul Gandih")); //true
        System.out.println(p.test("Ravi"));         //false
    }
}
