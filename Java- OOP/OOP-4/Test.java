class GP extends Object{
    public void m1(){
        System.out.println("GP Class m1 method");
    }
}
class Parent extends GP{
    public void m2(){
        System.out.println("Parent Class m2 method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("Child Class m3 method");
    }
}
class Test{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}