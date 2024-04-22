public class ExtraCheese extends Toppings{

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza)
    {
        this.pizza=pizza;
        System.out.println(" Extra Cheese added ");
    }
    @Override
    public int price() {
        return this.pizza.price()+50;
    }
}
