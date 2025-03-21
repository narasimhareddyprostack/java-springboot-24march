package FIEx3;

@FunctionalInterface
interface PredicateI{
    public abstract  boolean test(String ename);
}
public class PredicateEx2 implements  PredicateI{
    public boolean test(String ename){
        return  ename.length()>5;
    }
    public static void main(String[] args) {
        PredicateI  p=new PredicateEx2();
        System.out.println(p.test("Rahul gandhi"));
        System.out.println(p.test("Ravi"));
    }
}
