public class Employee{
    private int empId;
    private String empName;
            // + 
    public void setEmpId(int eId){
        this.empId = eId;
    }
    public int getEmpId(){
        return this.empId;
    }
    public void setEmpName(String ename){
        this.empName =ename;
    }
    public String getEmpName(){
        return this.empName;
    }
    public static void main(String[] args) {
       Employee e1=new Employee();
       e1.setEmpId(101);
       e1.setEmpName("Rahul");
       Employee e2=new Employee();
    
       e2.setEmpId(102);
       e2.setEmpName("priyanka");

       System.out.println(e1.getEmpId()+e1.getEmpName());
       System.out.println(e2.getEmpId()+e2.getEmpName());
    }
}