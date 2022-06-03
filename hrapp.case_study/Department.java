public class Department {
    
    private String name;
    
    private Employee[] employees = new Employee[10];
    
    private int employeeIndex = 0;
    
    public Department(String name) {
        this.name = name;
    }
    
    public Employee getEmployeeById(int id) {
        
        try {
            for(Employee e : employees) {
                if (e.getId() == id) {
                    return e;
                }
            }
        } catch (Exception exception) {
            System.out.println("ID doesn't exist.");
        }
        return null;
    }
    
    public double getTotalSalary() {
        double totalSalary = 0;
        for(int i = 0; i < employeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
    
    public double getAverageSalary() {
        if (employeeIndex == 0) {
            return 0;
        }
        return getTotalSalary() / employeeIndex;
    }
    
    public void addEmployee(Employee e) {
        if (employeeIndex < employees.length) {
            employees[employeeIndex] = e;
            employeeIndex++;
        }
    }
    
    public Employee[] getEmployees() {
        Employee[] presentEmployees = new Employee[employeeIndex];
        for(int i = 0; i < presentEmployees.length; i++) {
            presentEmployees[i] = employees[i];
        }
        return presentEmployees;
    }
    
    public int numberOfEmployeesNumber() {
        return employeeIndex;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
