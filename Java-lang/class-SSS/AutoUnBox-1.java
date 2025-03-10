class AutoUnBox {
    public static void main(String[] args) {
        int a=100;
        Integer a1=a; //autoboxing - convert primitive to Object
        int b=a1;     //unboxing   - convert Object to Primitive
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
    }
}
