package ArrayListOne;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();  //allowed Heterogeneous Objects
        ArrayList<Integer> eids=new ArrayList<Integer>();//allowed Integer Objects
        ArrayList<String> enames=new ArrayList<String>();//allowed String
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        System.out.println(eids);
        int i=0;
        while(i<=eids.size()-1){
            System.out.println(eids.get(i));
            i++;
        }
    }
}
