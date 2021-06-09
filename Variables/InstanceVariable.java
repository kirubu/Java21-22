class InstanceVariable
{
    int a=56;
    String str="Dad";
    public static void main(String[] args)
    {
        /* non-static variable or a method cannod be asccessed from a static method,
        even variable and method present in same class */

        /* System.out.println(a);
        System.out.println(str); *///non-static variable cannot be referenced from static context
        //int x = 45;
        new InstanceVariable().getVariable();
    }
    public void getVariable()
    {
        int a = 78;
        //String str = "Mom";
        System.out.println(a);
        System.out.println(x);
        System.out.println(str);
    }
}