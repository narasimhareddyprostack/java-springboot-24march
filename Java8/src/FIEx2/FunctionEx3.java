package FIEx2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionEx3 {
    public static void main(String[] args) {
        Function<List,Integer> f = enames->enames.size();
        List<String> enames= Arrays.asList("Rahul","Sonia","Priyanka");
        System.out.println(f.apply(enames));
    }
}
