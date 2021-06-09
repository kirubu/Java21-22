class InstanceVariable1
{
    int a=56,b;
    public static void main(String[] args)
    {
        //all obj will have seperate copy of variable initialized with original value
        int a=78;
        System.out.println(a);
        InstanceVariable1 obj1 = new InstanceVariable1();
        obj1.a++;
        obj1.a = obj1.a * 100;

        obj1.b++;
        obj1.b = obj1.b * 100;
        System.out.println(obj1.a+" "+obj1.b);

        InstanceVariable1 obj2 = new InstanceVariable1();
        obj2.a++;
        obj2.a = obj2.a * 100;

        obj2.b++;
        obj2.b = obj2.b * 100;
        System.out.println(obj2.a+" "+obj2.b);
    }
}