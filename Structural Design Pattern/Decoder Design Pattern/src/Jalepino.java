public class Jalepino extends Toppings{
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
