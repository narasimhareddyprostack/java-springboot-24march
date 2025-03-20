package LinkedListOne;

import java.util.LinkedList;

public class LinkedListOne {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList(); //allowed heterogenous Object
        LinkedList<Integer> eids=new LinkedList<Integer>();
        LinkedList<String> enames=new LinkedList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Narendra Modi");
        System.out.println(ll1);
        System.out.println(eids);
        System.out.println(enames);
        //update ename "Rahul" to Rahul Gandhi
        enames.set(0,"Rahul Gandhi");
        System.out.println(enames);
    }
}
