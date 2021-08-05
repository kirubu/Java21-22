class ConstructorDemo
{
    int a=60,b=60,c;
    ConstructorDemo()
    {
        System.out.println("im contructor");
        a = 56;
        this.b = 78;
        c = a + b;
    }
    public static void main(String[] args)
    {
        ConstructorDemo cd = new ConstructorDemo();
        
        System.out.println(cd.a+" "+cd.b+" "+cd.c);
    }
}