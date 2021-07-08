class Car
{
    public static int travel()
    {
        System.out.println("Base");
        return 4;
    }
}
class Maruti extends Car
{
    public static float travel()
    {
        System.out.println("Child");
        return 5;
    }
}
class StaticOverriding
{
    public static void main(String[] args)
    {
        Maruti obj = new Maruti();
        obj.travel();
        Car objb = new Car();
        objb.travel();
        Car objd = new Maruti();
        objd.travel();
    }
}