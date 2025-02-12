class Test {
    public static void main(String[] args) {
        int[] nums={7,18,14,281,41,13,46,5,9};
        //index     0,1,2...................8
        int sum=0;
        for (int num : nums) {
            sum = sum+num;
        }
        System.out.println("Sum of Array Elements:"+sum);
    }
}
