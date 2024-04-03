public class Eager_Initialization
{
    private static final Eager_Initialization instance =new Eager_Initialization();

    private Eager_Initialization()
    {
        System.out.println("Inside the constrcture");
    }
    private static getInstance()
    {
        System.out.println("Inside get method");
        return instance;
    }
}

