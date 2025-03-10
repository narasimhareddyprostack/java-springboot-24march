public class TestSix {
    public static void main(String[] args) {
        System.out.println("GM");
        Thread.sleep(2000); //CompileTimeException
        System.out.println("GM");
    }
    
}
/*
 * TestSix.java:4: error: unreported exception InterruptedException; 
 * must be caught or declared to be thrown
        Thread.sleep(2000);
 */
