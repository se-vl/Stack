class Cons implements PersistentStack
{
    private final double _head;
    private final PersistentStack _tail;
    
    public Cons(double head, PersistentStack tail)
    {
        _head = head;
        _tail = tail;
    }

    @Override
    public PersistentStack push(double x)
    {
        return new Cons(x, this);
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
}
