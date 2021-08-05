class Ott
{
    Ott()
    {
        System.out.println("Base Contructor");
    }
}
class Netflix extends Ott
{
    Netflix()
    {
        System.out.println("Child Contructor");
    }
}
class ConstructorInInherit
{
    public static void main(String[] args)
    {
        Netflix obj = new Netflix();
    }
}