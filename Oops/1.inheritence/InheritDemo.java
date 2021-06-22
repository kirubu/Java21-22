class Animal//final class cannot be inherited, any outer class cannot be a private
{
    String name;
    int leg;
    private int age = 20;
    public void fiveSense()
    {
        System.out.println("5 senses");
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
class InheritDemo
{
    public static void main(String[] args)
    {
        // derived class object
        Lion simba = new Lion();
        simba.name = "Lion King";
        simba.leg = 4;
        simba.fiveSense();
        simba.kingOfAnimal();
        //simba.age = 21;
    }
}