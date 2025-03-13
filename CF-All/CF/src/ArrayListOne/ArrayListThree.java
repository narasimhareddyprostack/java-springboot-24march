package ArrayListOne;

import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();  //allowed Heterogeneous Objects
        ArrayList<Integer> eids=new ArrayList<Integer>();//allowed Integer Objects
        ArrayList<String> enames=new ArrayList<String>();//allowed String
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Vijay");
        enames.add("Kamal");
        for (String ename:enames) {
            System.out.println(ename);
        }
        System.out.println(enames.isEmpty()); //flase
        System.out.println(enames.contains("Kamal"));//true
    }
}
