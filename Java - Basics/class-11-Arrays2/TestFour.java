class Test {
    public static void main(String[] args) {
        int[] nums={7,18,14,281,41,13,46,5,9};
        //index     0,1,2...................8
        int i=0;
        while(i<=8){

            if(nums[i]%2 !=0){
                System.out.println("Odd Numbers:" + nums[i]);
            }
            i++;
        }
    }
}
