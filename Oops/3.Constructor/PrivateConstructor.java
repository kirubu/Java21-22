//Eg.singleton class-contains only one object per class
class Cooking
{
    static Cooking obj = new Cooking();
    private Cooking()
    {

    }
    public static Cooking initiateCooking()
    {
        System.out.println("object created");
        return obj;
    }
}
class PrivateConstructor
{
    public static void main(String[] args)
    {
        //Cooking obj = new Cooking();
        Cooking obj = Cooking.initiateCooking();
        Cooking obj1 = Cooking.initiateCooking();
    }
}