package FIEx2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionOne{
    public abstract  int apply(List names);
}
public class FunctonEx2 {
    public static void main(String[] args) {
        FunctionOne f=enames->enames.size();
        List<String> enames=new ArrayList<String>();
        enames.add("RG");
        enames.add("SG");
        enames.add("PG");
        System.out.println(f.apply(enames));
    }
}
