package LinkedListOne;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTwo {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList(); //allowed heterogenous Object
        LinkedList<Integer> eids=new LinkedList<Integer>();
        LinkedList<String> enames=new LinkedList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Narendra Modi");
        //iterate LinkedList object using for,while,do{}while loop,forEach and iterator
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
