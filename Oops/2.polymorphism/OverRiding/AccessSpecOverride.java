class Mobile
{
    private void smart()
    {
        System.out.println("Base Method");
    }
}
class Moto extends Mobile
{
    public void smart()
    {
        System.out.println("Child Method");
    }
}
class AccessSpecOverride
{
    public static void main(String[] agrs)
    {
        Moto e5 = new Moto();
        e5.smart();
    }
}