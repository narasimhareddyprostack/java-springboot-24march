//Recreate AIOBException - Runtime Expection
class Test{
    public static void main(String[] args) {
        int[] eids; // declaration
        eids=new int[4];//creation
        eids[0] = 101;
        eids[1] = 102;
        eids[2] = 103;
        eids[3] = 104;
        //Read array elements
        System.out.println(eids);  //[I@abc32332
        System.out.println(eids[0]);  //101  
        System.out.println(eids[1]);  //102
        System.out.println(eids[2]);  //103
        System.out.println(eids[3]);  //104
        System.out.println(eids[10]);  //AIOBSException ie Runtime
        //ArrayIndexOutOfBoundsException
        //Index 10 out of bounds for length 4
        
    }
}