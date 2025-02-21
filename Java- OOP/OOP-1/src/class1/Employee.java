package class1;

public class Employee {
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.setEmpId(101);
        e1.setEmpId(101);
        e1.setEmpName("Rahul");
        System.out.println("Emp Id:"+ e1.getEmpId() + "Emp Name"+e1.getEmpName());
    }
}
