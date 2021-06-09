class StaticVariable
{
    static int a = 20;
    public static void main(String[] args)
    {
        System.out.println(a);
        int x = a;
        x = ++a;
        System.out.println(x+" "+a);
        x = x + 10;
        System.out.println(x+" "+a);
        StaticVariable obj1 = new StaticVariable();
        obj1.a++;
        obj1.a = obj1.a + 10;
        System.out.println(obj1.a);

        StaticVariable obj2 = new StaticVariable();
        System.out.println(obj2.a);
        obj2.a+=10;
        System.out.println(obj1.a);
    }
}