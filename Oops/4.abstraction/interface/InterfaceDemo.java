interface SetupBox
{
    int x = 90;
    //interface doesnot contain constructor
}
class InterfaceDemo
{
    public static void main(String[] args)
    {
        SetupBox.x = 90;
        System.out.println(SetupBox.x);
    }
}