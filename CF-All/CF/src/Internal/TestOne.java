package Internal;

//remove specail char from given string
public class TestOne {
    public static void main(String[] args) {
        String st="Welco#me t%o P^ro St*ac()k";
        String result_st=st.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result_st);
    }
}
