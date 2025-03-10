public class WC2 {
    public static void main(String[] args) {
        Integer a1 = 100; //unboxing
        // internally calling - Integer.valueOf(100)
        System.out.println(a1);

        int a=a1.intValue();
        System.out.println(a);
    }
}
