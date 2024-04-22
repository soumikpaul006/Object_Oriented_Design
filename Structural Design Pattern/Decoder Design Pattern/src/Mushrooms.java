public class Mushrooms extends BasePizza{
    BasePizza pizza;

    public Mushrooms(BasePizza pizza)
    {
        this.pizza=pizza;
        System.out.println(" Mushrooms added ");
    }
    @Override
    public int price() {
        return this.pizza.price()+100;
    }
}
