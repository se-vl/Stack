interface PersistentStack
{
    /**
     * Returns another stack with x on top.
     */
    PersistentStack push(double x);
    
    /**
     * Returns the element on top of the stack. 
     */
    double top();
    
    /**
     * Returns the stack below the top element.
     */
    PersistentStack pop();
    
    /**
     * Determines whether this stack is empty.
     */
    boolean isEmpty();
}
