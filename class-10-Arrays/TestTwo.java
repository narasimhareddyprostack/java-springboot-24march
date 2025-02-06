class Test {
    public static void main(String[] args) {
        String[] enames;//declaration
        enames = new String[5];//creation
        enames[3] = "Modi"; //initlization
        //read array elements
        System.out.println(enames[0]); //null
        System.out.println(enames[1]); //null
        System.out.println(enames[2]); //null
        System.out.println(enames[3]); //Modi
        System.out.println(enames[4]); //null
    }
}
