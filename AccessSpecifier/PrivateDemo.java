class PrivateDemo
{
    private int age=78;
    private void mathMtd()
    {
        System.out.println("im a private method");
    }
    public static void main(String[] args)
    {
        PrivateDemo math = new PrivateDemo();
        math.age = 40;
        System.out.println(math.age);
        math.mathMtd();
    }
}
class Algebra extends PrivateDemo
{
    public void deAlgebra()
    {
        PrivateDemo obj = new PrivateDemo();
        System.out.println(obj.age);
    }
}