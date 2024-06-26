public class SocketClassAdapterImpl extends Socket implements SocketAdapter
{
    @Override
    public Volt get120Volt() {
        return getVolts();
    }

    @Override
    public Volt get3Volt() {
        Volt v=getVolts();
        return convertVolt(v,40);
    }

    @Override
    public Volt get12Volt() {
        Volt v=getVolts();
        return convertVolt(v,10);
    }

    public Volt convertVolt(Volt v,int i)
    {
        return new Volt(v.getVolts()/i);
    }
}
