class Test{
    int a;
    static int b;
    public static void main(String[] args) {
        int c=300;
        Test t1=new Test();
        System.out.println(t1.b+Test.b+b);//0
        System.out.println(t1.a+t1.b+c);//300
        Test t2=new Test();
        t2.a=101;
        t2.b = 11;
        System.out.println(t1.a + t2.a+t1.b);//112
        //                  0       101  11  
        b = 14;
        System.out.println(t1.b+t2.b+Test.b+b);//56
       
    }
}