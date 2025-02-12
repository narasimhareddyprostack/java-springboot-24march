class Test{
          int a=100;//non-static or instance variabe
   static int b=200;//static variable or class level var
 public static void main(String[] args) {
          int c=300;//local variable
          //System.out.println(a); //CE
          System.out.println(b); //200
          System.out.println(c); //300
 }
}