class StaticMethodDemo{
    public static void demo(){
        System.out.println("staticMethodDemo");
    }
}
class MethodDemo
{
    //Access Specifier
    //non access modifier(keyword) - static, final, abstract, strictfp, synchronized
    //return type- void, primitive, non primitive
    //method name
    //parameter - void, primitive, non primitive
    //throws exception
    public static void main(String[] args)
    {
        System.out.println("im in main method");
        MethodDemo md = new MethodDemo();
        md.add();
        new MethodDemo().add();
        subtract();
        md.subtract();
        StaticMethodDemo.demo();
        StaticMethodDemo stm = new StaticMethodDemo();
        stm.demo();
    }
    public void add()//non static method
    {
        System.out.println("im inside add method");
    }
    public static void subtract()//static method
    {
        System.out.println("im in static method");
    }
}