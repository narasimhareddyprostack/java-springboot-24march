class TestOne{
    int a;
    static int b;
    public static void main(String[] args) {
        int c=300;
        System.out.println(b+TestOne.b); //0
        //                 0 +  0   //default value
        //how to access Static Variable
        //a)using object
        //b)using Class Name
        //c)using directly in static context
    }
}