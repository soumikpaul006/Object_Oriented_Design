public class Main {
    public static void main(String[] args)
    {
        BasePizza pizza=new ExtraCheese(new Mushrooms(new Jalepino(new ExtraCheese(new Veggi ()))));

        System.out.println("Total cost "+pizza.price());

    }
}