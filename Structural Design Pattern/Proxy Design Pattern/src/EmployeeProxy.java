import java.util.Objects;

public class EmployeeProxy implements EmployeeDAO
{
    EmployeeDAO empObj;

    EmployeeProxy()
    {
        empObj=new EmployeeImpl();
    }
    @Override
    public void create(String name, Employee obj) throws Exception
    {
        if(name.equals("ADMIN"))
        {
            empObj.create(name,obj);
            return;
        }
        throw new Exception("Not Authorised");

    }

    @Override
    public void delete(String name, int empId) throws Exception
    {
        if(name.equals("ADMIN"))
        {
            empObj.delete(name,empId);
            return;
        }
        throw new Exception("Not Authorised");
    }

    @Override
    public Employee get(String name, int empId) throws Exception
    {
        if(name.equals("ADMIN")||name.equals("USER"))
        {
            return empObj.get(name,empId);

        }
        throw new Exception("Access Denied");
    }
}
