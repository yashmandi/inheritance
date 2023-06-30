public class EmpCall {
    public static void main(String[] args) {
       Employee emp = new Employee(10000);
    HRM hr = new HRM(20000);

    emp.work();
    System.out.println("EMployee Salary: " + emp.getSalary());
    
    hr.work();
    System.out.println("Manager Salary: " + hr.getSalary());

    hr.addEmployee();
    }
    
    

}
