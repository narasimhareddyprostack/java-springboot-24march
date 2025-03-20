package LinkedListOne;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListThree {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList(); //allowed heterogenous Object
        LinkedList<Integer> eids=new LinkedList<Integer>();
        LinkedList<String> enames=new LinkedList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Narendra Modi");
       //sort LinkedList Object - using Collections : Utility Class
        System.out.println(enames);
        Collections.sort(enames);
        System.out.println(enames);

    }
}
