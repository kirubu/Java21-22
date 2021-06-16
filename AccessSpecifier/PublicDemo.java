class PublicDemo
{
    public int age=78;
    public void mathMtd()
    {
        System.out.println("im a public method");
    }
    public static void main(String[] args)
    {
        PublicDemo math = new PublicDemo();
        math.age = 40;
        System.out.println(math.age);
        math.mathMtd();
        Child ch = new Child();
        ch.doAccess();
    }
}
class Child //extends PublicDemo
{
    public void doAccess()
    {
        PublicDemo obj = new PublicDemo();
        System.out.println(obj.age);
    }
}