public class Main {
    public static void main(String[] args)
    {
        Shape golCircle=new Circle("RED");
        golCircle.draw();


        Shape cloneGolCircle=golCircle.clone();


        cloneGolCircle.setColor("BLUE");

        cloneGolCircle.draw();
    }
}