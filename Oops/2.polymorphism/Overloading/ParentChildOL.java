class ParentChildOL
{
    public void burger(String s)
    {
        System.out.println("String args");
    }
    public void burger(Object s)
    {
        System.out.println("Object args");
    }
    public static void main(String[] args)
    {
        ParentChildOL obj = new ParentChildOL();
        obj.burger("kfc");
        obj.burger(new Object());
        obj.burger(null);
    }
}