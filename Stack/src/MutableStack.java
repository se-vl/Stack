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
        double result = top();//_current.top();
        _current = _current.pop();
        return result;
    }
}
