class Cons extends AbstractStack
{
    private final double _head;
    private final PersistentStack _tail;

    public Cons(double head, PersistentStack tail)
    {
        _head = head;
        _tail = tail;
    }

    @Override
    public double top()
    {
        return _head;
    }

    @Override
    public PersistentStack pop()
    {
        return _tail;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public int size()
    {
        return 1 + _tail.size();
    }
}
