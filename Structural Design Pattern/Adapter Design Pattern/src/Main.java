public class Main {
    public static void main(String[] args)
    {
        testClassAdapter();
    }
    public static void testClassAdapter()
    {
        SocketAdapter socket=new SocketClassAdapterImpl();
        Volt v3=getVolt(socket,3);
        Volt v12=getVolt(socket,12);
        Volt v120=getVolt(socket,120);

        System.out.println("v3 volts using Class Adapter= "+v3.getVolts());
        System.out.println("v12 volts using Class Adapter= "+v12.getVolts());
        System.out.println("v120 volts using Class Adapter= "+v120.getVolts());

    }
    public static Volt getVolt(SocketAdapter sockAdapter,int i)
    {
        switch (i){
            case 3: return sockAdapter.get3Volt();
            case 12: return sockAdapter.get12Volt();
            case 120: return sockAdapter.get120Volt();
            default: return sockAdapter.get120Volt();
        }

    }
}