public class Fish extends LivingThings {
    public Fish(BreadthImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breadth();
    }
}
