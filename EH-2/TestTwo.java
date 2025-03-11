public class TestTwo {
    public static void main(String[] args)  {
        System.out.println("GM");
        //System.out.println(10/0);
        try{
            throw new ArithmeticException("/ by Zero");
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("GN");
    }
}
