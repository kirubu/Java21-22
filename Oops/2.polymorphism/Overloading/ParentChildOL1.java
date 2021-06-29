class ParentChildOL1
{
    public void burger(String s)
    {
        System.out.println("String args");
    }
    public void burger(StringBuffer s)
    {
        System.out.println("Object args");
    }
    public static void main(String[] args)
    {
        ParentChildOL obj = new ParentChildOL();
        obj.burger("kfc");
        obj.burger(new StringBuffer("welcome"));
        obj.burger(null);
    }
}