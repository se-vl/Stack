abstract class AbstractStack implements PersistentStack
{
    @Override
    public PersistentStack push(double x)
    {
        return new Cons(x, this);
    }
}
