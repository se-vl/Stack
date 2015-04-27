class Nil extends AbstractStack
{
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
