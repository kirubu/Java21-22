class Tiger
{
    public Number eating()
    {
        System.out.println("base methods");
        return null;
    }
}
class SmallTiger extends Tiger
{
    public Double eating()
    {
        System.out.println("child methods");
        return null;
    }
}
class CovarientReturnType
{
    public static void main(String[] args)
    {
        SmallTiger st = new SmallTiger();
        st.eating();
    }
}