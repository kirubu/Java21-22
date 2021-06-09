class InstanceVariableAccOutSideClass
{
    int a=56;
    String str="Dad";
    public static void main(String[] args)
    {
        InternStars obj = new InternStars();
        obj.getOtherClassVariable();
    }
}
class InternStars
{
    public void getOtherClassVariable()
    {
        InstanceVariableAccOutSideClass obj = new InstanceVariableAccOutSideClass();
        System.out.println(obj.a);
        System.out.println(obj.str);
    }
}