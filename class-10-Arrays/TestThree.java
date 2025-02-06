class Test {
    public static void main(String[] args) {
       int[] eids={101,102,103};
       long[] mobiles={9191,9192,9193};
       float[] esalaries1 = {45000.45f,55000.55f,65000.65f};
       double[] esalesalaries2 = {45000.00,55000.00};
       char[] avail = {'Y','N'};
       boolean[] discounts={true,false};
       String[] enames={"RG","SG","PG","Modi"};

       System.out.println(eids);  //[I@2c7b84de
       System.out.println(esalesalaries2); //[D@3fee733d
       System.out.println(avail);
       
       System.out.println(discounts);
       System.out.println(enames); // [Ljava.lang.String;@4617c264

    }
}
