class Test {
    public static void main(String[] args) {
       
      String[] enames;//Array Declaration
      enames=new String[4];//Array Creation
      enames[0] = "Rahul"; 
      enames[1] = "Sonia";
      enames[3] = "Modi";
      //read array elements - using while loop
      int i=0;
      while(i<=3){
        System.out.println(enames[i]);
        i++;
      }

    }
}
