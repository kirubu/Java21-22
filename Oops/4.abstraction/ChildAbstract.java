abstract class Laptop
{
    public abstract void configuration();
}
abstract class Dell extends Laptop
{
    public void configuration()
    {
        System.out.println("Dell Configuration Method");
    }
    public void powerSave()
    {
        System.out.println("Child Method");
    }
    public abstract void keyboard(); 
}
class Inspiron extends Dell
{
     public void configuration()
    {
        System.out.println("Inspiron Configuration Method");
        super.configuration();
    }
    public void keyboard()
    {
        System.out.println("Inspiron keyboard Method");
    }
}
class ChildAbstract
{
    public static void main(String[] args)
    {
        Inspiron obj = new Inspiron();
        //Dell obj = new Dell();
        obj.configuration();
    }
}