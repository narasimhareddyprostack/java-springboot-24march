class Test{
     byte a;
     short b;
     int c;
     long d;
     float e;
     double f;
     char g;
     boolean h;
     String ename;
 public static void main(String[] args) {
         Test t1=new Test();
         System.out.println(t1.a);  //0
         System.out.println(t1.b);  //0
         System.out.println(t1.c);  //0
         System.out.println(t1.d);  //0
         System.out.println(t1.e);  //0.0
         System.out.println(t1.f);  //0.0
         System.out.println(t1.g);  //uo0
         System.out.println(t1.h);  //false
         System.out.println(t1.ename);//null
       
 }
}