class MutableStack
{
    private PersistentStack _current;

    public MutableStack()
    {
        _current = new Nil();
    }

    public void push(double x)
    {
        _current = _current.push(x);
    }

    public double top()
    {
        return _current.top();
    }

    public double pop()
    {
        double result = _current.top();
        _current = _current.pop();
        return result;
    }
    
    public boolean isEmpty()
    {
        return _current.isEmpty();
    }
    
    public int size()
    {
        return _current.size();
    }
}
