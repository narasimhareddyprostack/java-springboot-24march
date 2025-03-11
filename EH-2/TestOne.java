public class TestOne {
    public static void main(String[] args) {
        System.out.println("GM");
        System.out.println(10/0);
        System.out.println("GN");
    }
}
/*
 * at Runtime
 * Exception in thread "main" java.lang.ArithmeticException: 
 * / by zero  at TestOne.main(TestOne.java:4)
 */
