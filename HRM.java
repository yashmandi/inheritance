public class HRM extends Employee {
    public HRM(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("\nManaging Employee");
    }
    
    public void addEmployee() {
        System.out.println("\nAdding new employee");
    }
}
