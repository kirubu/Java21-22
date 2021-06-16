class ProtectedDemo
{
    protected int age = 45;
    protected void printAge()
    {
        System.out.println("im a protected method");
    }
    public static void main(String[] agrs)
    {
        ProtectedDemo pd = new ProtectedDemo();
        pd.printAge();
        System.out.println(pd.age);
        Bottle bot = new Bottle();
        bot.getDetails();
    }
}
class Bottle extends ProtectedDemo
{
    public void getDetails()
    {
        ProtectedDemo obj = new ProtectedDemo();
        System.out.println(obj.age);
    }
}