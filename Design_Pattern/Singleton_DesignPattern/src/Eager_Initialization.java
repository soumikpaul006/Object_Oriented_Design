public class Eager_Initialization
{
    private static final Eager_Initialization instance =new Eager_Initialization();

    private Eager_Initialization()
    {
        System.out.println("Object getting created Eagerly");
    }
    public static Eager_Initialization getInstance()
    {
        System.out.println("Returing static instance in eager initialization");
        return instance;
    }
}