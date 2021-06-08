class Actoress
{
    String name="Nayanthara"; int age=32;
}
class ClassReturnType
{
    public static void main(String[] args)
    {
        Actoress act = new Actoress();
        System.out.println(act.name+" "+act.age);

        act = getActoressDetails(act);
        System.out.println(act.name+" "+act.age);

        Actoress obj = getActoressDetails(act);
        System.out.println(obj.name+" "+obj.age);
    }
    public static Actoress getActoressDetails(Actoress obj)
    {
        Actoress actObj = obj;
        //Actoress actObj = new Actoress();
        /* actObj.name = "Lady Super Star";
        actObj.age = 31; 
        return obj;
        */
        obj.name = "Lady Super Star";
        obj.age = 31;
        return actObj;
    }
}