public class Tree extends LivingThings {


    public Tree(BreadthImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breathProcess() {
        breathImplementor.breadth();
    }
}
