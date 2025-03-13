package ArrayListOne;

import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        System.out.println(al); //[]
        al.add(101);
        al.add("Rahul");
        al.add(45000.45);
        al.add("Wayanad");
        System.out.println(al);//[101, Rahul, 45000.45, Wayanad]
        for(int i=0;i<=al.size()-1;i++){
            System.out.println(al.get(i));
        }
    }
}
