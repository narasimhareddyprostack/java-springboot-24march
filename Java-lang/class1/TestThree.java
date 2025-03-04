public class Test extends Object {

    public String getMyName(){
        return "ProStack";
    }
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println(t1); //Test@2c7b84de
        System.out.println(t1.toString()); //Test@2c7b84de
        System.out.println(t1.getMyName()); //ProStack
    }
}
