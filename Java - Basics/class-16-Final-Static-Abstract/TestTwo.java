class Parent{
    public final void getGoodQualities(){
        System.out.println("Parent class- Method GGQ");
    }
}
class Child extends Parent{
    public void getGoodQualities(){
        System.out.println("Child class- Method GGQ");
    }
public static void main(String[] args) {
    Parent p1=new Parent();
    p1.getGoodQualities();
    Child c1=new Child();
    c1.getGoodQualities();
    
}
}