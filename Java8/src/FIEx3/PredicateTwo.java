package FIEx3;

@FunctionalInterface
interface PredicateOne{
    public  abstract  boolean test(String ename);
}
public class PredicateTwo {
    public static void main(String[] args) {
        PredicateOne p=ename->ename.length()>5;
        System.out.println(p.test("Rahul Gandhi"));
        System.out.println(p.test("Ravi"));
    }
}
