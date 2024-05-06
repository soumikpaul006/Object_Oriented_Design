public abstract class LivingThings {

    BreadthImplementor breathImplementor; //reference of the implementor class

    public LivingThings(BreadthImplementor breathImplementor)
    {
        this.breathImplementor=breathImplementor;
    }

    abstract public void breathProcess();

}
