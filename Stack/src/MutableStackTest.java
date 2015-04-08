import static org.junit.Assert.*;

import org.junit.Test;

public class MutableStackTest
{
    private MutableStack _stack;

    public MutableStackTest()
    {
        _stack = new MutableStack();
    }

    @Test
    public void testFreshStackIsIndeedEmpty()
    {
        assertTrue(_stack.isEmpty());
        assertEquals(0, _stack.size());
    }

    @Test
    public void testOneElementStack()
    {
        _stack.push(42);
        assertFalse(_stack.isEmpty());
        assertEquals(42.0, _stack.top());
        assertEquals(1, _stack.size());
    }

    @Test
    public void testTwoElementStack()
    {
        _stack.push(1);
        _stack.push(2);
        _stack.pop();
        assertEquals(1.0, _stack.top());
    }
}
