public class LazyInitialization
{
    private static LazyInitialization lazyInstance = null;

    private LazyInitialization()
    {
        System.out.println("Object getting created Lazy ");
    }
    public static LazyInitialization getInstance()
    {
        System.out.println("Returing static instance in lazy initialization");

        if(null==lazyInstance)
        {
            lazyInstance=new LazyInitialization();
        }

        return lazyInstance;
    }
}
