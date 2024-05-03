public class Main
{
    public static void main(String[] args) throws Exception
    {
        //Client
        try{
            EmployeeDAO obj=new EmployeeProxy();
            obj.create("ADMIN", new Employee());
//            obj.create("USER", new Employee());
            obj.get("USER",123);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}