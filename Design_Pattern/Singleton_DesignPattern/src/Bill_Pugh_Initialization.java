public class Bill_Pugh_Initialization
{
    private Bill_Pugh_Initialization(){
        System.out.println("Creating instance of outerClass"); // object of this class withs be created

    }

    private static class innerClass
    {
        public innerClass()
        {
            System.out.println("Creating instance of innerClass"); // object of this class with not be created
        }

        private static final Bill_Pugh_Initialization instance=new Bill_Pugh_Initialization();

    }

    public static  Bill_Pugh_Initialization getInstance()
    {
        System.out.println("Returing static instance from get method");
        return innerClass.instance;
    }

}
