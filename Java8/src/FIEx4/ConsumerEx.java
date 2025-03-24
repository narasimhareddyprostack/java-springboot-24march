package FIEx4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface ConsumerI{
    public abstract  void accept(List enames);
}
public class ConsumerEx {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Rahul","SG","PG");

        ConsumerI c1 = enames -> {
            for (Object ename:enames) {
                System.out.println(ename);
            }
        };  //useer defined FI
        c1.accept(names);

        Consumer<List> c2 = enames->{
            for (Object ename:enames) {
                System.out.println(ename);
            }
        };//predefined FI
        c2.accept(names);
    }
}
