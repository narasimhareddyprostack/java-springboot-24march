package FIEx2;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface  FunctionTwo{
    public abstract  int apply(List enames);
}
public class FunctionEx1 implements FunctionTwo{
    public int apply(List enames){
        return  enames.size();
    }
    public static void main(String[] args) {
        FunctionTwo obj=new FunctionEx1();
        List<String> enames= Arrays.asList("RG","SG");
        System.out.println(obj.apply(enames));
    }
}
