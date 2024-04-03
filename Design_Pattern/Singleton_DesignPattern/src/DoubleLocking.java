public class DoubleLocking
{

    private static DoubleLocking Instance = null;

    private DoubleLocking()
    {
        System.out.println("Object getting created in Double locking ");
    }
    public static DoubleLocking getInstance()
    {
        System.out.println("Returing static instance in Double Locking");

        if(null==Instance)
        {
            synchronized (DoubleLocking.class)
            {
                if(null==Instance)
                {
                    Instance=new DoubleLocking();
                }
            }

        }

        return Instance;
    }
}
