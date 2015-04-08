class PostfixParser
{
    private MutableStack _operands;

    public PostfixParser()
    {
        _operands = new MutableStack();
    }

    /**
     * Evaluates a given formula in postfix notation.
     * For example, evaluate("1 2 3 * +") returns 7. 
     */
    public double evaluate(String postfixFormula)
    {
        String[] atoms = postfixFormula.split(" ");
        for (String atom : atoms)
        {
            switch (atom)
            {
            case "+":
                add();
                break;

            case "*":
                multiply();
                break;

            default:
                insert(atom);
                break;
            }
        }
        return _operands.pop();
    }

    private void insert(String atom)
    {
        double x = Integer.parseInt(atom);
        _operands.push(x);
    }

    private void multiply()
    {
        double b = _operands.pop();
        double a = _operands.pop();
        _operands.push(a * b);
    }

    private void add()
    {
        double b = _operands.pop();
        double a = _operands.pop();
        _operands.push(a + b);
    }
}
