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
class InheritDemoUpCast
{
    public static void main(String[] args)
    {
        //Upcasting
        //Lion nala = new Animal();//Error
        Lion nala = (Lion)new Animal();//explicitly tape casted to base class, can access only base class instence
        nala.name = "Lion King";
        nala.fiveSense();
    }
}