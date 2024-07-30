public class EmployeeManagement {
    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            resize();
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[--size];
                employees[size] = null;
                break;
            }
        }
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + ": " + employees[i].getPosition());
        }
    }

    private void resize() {
        Employee[] newEmployees = new Employee[employees.length * 2];
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        employees = newEmployees;
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(2);

        management.addEmployee(new Employee(1, "John", "Manager", 50000));
        management.addEmployee(new Employee(2, "Julie", "Developer", 40000));
        
        System.out.println();

        System.out.println("Traverse Employees:");
        management.traverseEmployees();
        System.out.println();
        System.out.println("Search Employee:");
        System.out.println(management.searchEmployee(2).getName());
        System.out.println();
        management.deleteEmployee(1);
        System.out.println("After Deletion:");
        management.traverseEmployees();
    }
}
