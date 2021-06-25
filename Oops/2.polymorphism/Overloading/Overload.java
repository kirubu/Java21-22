class Overload
{
    private void calc()
    {
        System.out.println("0 args");
    }
    private int calc(int i)
    {
        System.out.println("1 int args "+i);
        return 0;
    }
    public final String calc(String i)
    {
        System.out.println("1 String args "+i);
        return "java";
    }
    public Overload calc(int i, int j)
    {
        System.out.println("2 int args"+(i+j));
        return new Overload();
    }
    public static void main(String[] args)
    {
        Overload obj = new Overload();
        obj.calc(); obj.calc(10); obj.calc("Lockdown 3.0");obj.calc(10,20);
    }
}