public class StringEx {
    public static void main(String[] args) {
        String s1 = "Rahul";// using String literal - only 1 object at SCP
        String s2 = new String("Rahul");//2 object
        System.out.println(s1.equals(s2));
    }
}
