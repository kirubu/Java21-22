class Animal//final class cannot be inherited, any outer class cannot be a private
{
    String name;
    int leg;
    private int age = 20;
    public void fiveSense()
    {
        System.out.println("5 senses");
        //return 0;
    }
}
class Lion extends Animal
{
    int child;
    public void kingOfAnimal()
    {
        System.out.println("King of Animal");
    }
}
class InheritDemoDownCast
{
    public static void main(String[] args)
    {
        //downcasting
        Animal kingKong = new Lion();
        kingKong.name = "Monkey";
        System.out.println(kingKong.name);
        kingKong.fiveSense();
        /* kingKong.child = 4;
        System.out.println(kingKong.child);
        kingKong.kingOfAnimal(); *///Error becoz downcasting allowed to access only base class instence
    }
}