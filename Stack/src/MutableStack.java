class MutableStack
{
    private PersistentStack _current;

    /**
     * @ensure result.isEmpty()
     * @result result.size() == 0
     */
    public MutableStack()
    {
        _current = new Nil();
    }

    /**
     * @ensure !isEmpty()
     * @ensure top() == x
     * // @ensure size() == old size() + 1
     */
    public void push(double x)
    {
        _current = _current.push(x);
    }

    /**
     * @require !isEmpty()
     */
    public double top()
    {
        assert !isEmpty() : "Vorbedingung verletzt";

        return _current.top();
    }

    /**
     * @require !isEmpty()
     */
    public double pop()
    {
        assert !isEmpty() : "Vorbedingung verletzt";

        double result = _current.top();
        _current = _current.pop();
        return result;
    }

    public boolean isEmpty()
    {
        return _current.isEmpty();
    }

    /**
     * @ensure result >= 0
     */
    public int size()
    {
        return _current.size();
    }
}
