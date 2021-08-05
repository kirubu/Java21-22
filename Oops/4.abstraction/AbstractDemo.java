abstract class Animal
{
    String x = "67";
    Animal()
    {
        System.out.println("Base constructor");
    }
    public abstract void voice();
    public void habbit()//concrete method
    {
        System.out.println("habbit");       
    }
}
class Cat extends Animal
{
    public void voice()
    {
        System.out.println("voice method");
    }
}
class AbstractDemo
{
    public static void main(String[] args)
    {
        Cat obj = new Cat();
        obj.voice();
        obj.habbit();
    }
}