public class Jalepino extends BasePizza{
    BasePizza pizza;

    public Jalepino(BasePizza pizza)
    {
        this.pizza=pizza;
        System.out.println(" jalepinos added ");
    }
    @Override
    public int price() {
        return this.pizza.price()+70;
    }
}
