public class HRApp {
    
    public static void main(String[] args) {

        System.out.println("----- HR App -----\n");
        
        Employee e1 = new Employee(1, "Peon", 450);
        
        Department d1 = new Department("Work Work");
        
        d1.addEmployee(e1);
        d1.addEmployee(new Employee(2, "Lazy Peon", 150));
        
        Employee[] staff = d1.getEmployees();
        
        System.out.println("Our awesome employees in " + d1.getName() + " department:");
        for(Employee e : staff) {
            System.out.println(e);
        }
        
        System.out.println("\n-----");
        System.out.println("Total salary: " + d1.getTotalSalary());
        System.out.println("Average salary: " + d1.getAverageSalary());
        System.out.println("Employee with id " + e1.getId() + ": " + d1.getEmployeeById(1));
    }
}
