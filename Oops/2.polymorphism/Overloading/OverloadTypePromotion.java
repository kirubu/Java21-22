class OverloadTypePromotion
{
    public void add(int i)
    {
        System.out.println("1 int args "+i);
    }
    public String add(String s)
    {
        System.out.println("1 string args "+s);
        return "java";
    }
    public void add(int i, int j)
    {
        System.out.println("2 int args"+(i+j));
    }
    public void add(int i, boolean j,double k)
    {
        System.out.println("3 args"+(i+j));
    }
    public static void main(String[] args)
    {
        OverloadTypePromotion obj = new OverloadTypePromotion();
        obj.add(10);
        obj.add('d');
    }
}