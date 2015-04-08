class Main
{
    public static void main(String[] args)
    {
        PostfixParser parser = new PostfixParser();
        double x = parser.evaluate("1 2 3 * +");
        System.out.println(x);
    }
}
