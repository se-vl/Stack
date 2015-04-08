class Nil implements PersistentStack
{
    @Override
    public PersistentStack push(double x)
    {
        return new Cons(x, this);
    }

    @Override
    public double top()
    {
        // TODO Better error handling in future lectures
        return Double.NaN;
    }

    @Override
    public PersistentStack pop()
    {
        // TODO Better error handling in future lectures
        return null;
    }

    @Override
    public boolean isEmpty()
    {
        return true;
    }

    @Override
    public int size()
    {
        return 0;
    }
}
