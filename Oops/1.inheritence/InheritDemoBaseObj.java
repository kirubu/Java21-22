class Animal//final class cannot be inherited, any outer class cannot be a private
{
    String name;
    int leg;
    private int age = 20;
    public void fiveSense()
    {
        System.out.println("5 senses "+age);//only public method of a class can access private variable
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
class InheritDemoBaseObj
{
    public static void main(String[] args)
    {
        // Base class object
        Animal obj = new Animal();
        obj.fiveSense();//with help public method private variables are accessed
        obj.name = "Deer";
        obj.leg = 4;
        //System.out.println(obj.age);//cannot access bcoz age is private
       /*  obj.child = 3;
        System.out.println(obj.child);
        obj.kingOfAnimal(); */
    }
}