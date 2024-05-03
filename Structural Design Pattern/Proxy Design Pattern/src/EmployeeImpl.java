public class EmployeeImpl implements EmployeeDAO{
    @Override
    public void create(String name, Employee obj) throws Exception {
        System.out.println("Employee created");
    }

    @Override
    public void delete(String name, int empId) throws Exception {
        System.out.println("Employee deleted");
    }

    @Override
    public Employee get(String name, int empId) throws Exception {
        System.out.println("Employee fetching from db");
        return new Employee();

    }
}
