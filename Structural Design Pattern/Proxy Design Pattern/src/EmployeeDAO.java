public interface EmployeeDAO {

    public void create(String name,Employee obj) throws Exception;
    public void delete(String name, int empId) throws Exception;
    public Employee get(String name, int empId) throws Exception;

}
