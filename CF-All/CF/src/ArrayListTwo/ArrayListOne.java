package ArrayListTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOne {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("RG");
        enames.add("SG");
        enames.add("PG");
        enames.add("NM");
        //Iterate - List object using for,while,dowhile,forEach and using iterator
       /* for (String ename:enames) {
            System.out.println(ename);
        }
       */
        /*Iterator itr=enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */
        for(int i=0;i<=enames.size()-1;i++){
            System.out.println(enames.get(i));
        }
    }
}
