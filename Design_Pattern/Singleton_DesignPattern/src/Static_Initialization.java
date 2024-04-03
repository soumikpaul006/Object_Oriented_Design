public class Static_Initialization
{
    private static Static_Initialization instance;

    static{
        try{
            instance=new Static_Initialization();
        }catch(Exception e)
        {
            throw  new RuntimeException("Exception");
        }

    }

    private Static_Initialization()
    {
        System.out.println("Object getting created Eagerly in Static block");
    }
    public static Static_Initialization getInstance()
    {
        System.out.println("Returing static instance in Static initialization");
        return instance;
    }
}
