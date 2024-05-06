public class Dog extends LivingThings {
    public Dog(BreadthImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breadth();
    }
}
