public class Client
{
    private static Vehicle vinstance;

    Client(VehicleFactory factory)
    {
        vinstance=factory.createVehicle();
    }

    public Vehicle getVehicle()
    {
        return vinstance;
    }
}
