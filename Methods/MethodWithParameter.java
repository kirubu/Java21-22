class Actor
{
    int age=56,totalMovie=67;
    String name="super star";
}
class MethodWithParameter
{
    public void add(int a,int b,int[] arr)
    {
        String str = "local";
        System.out.println(a+b);
        System.out.println(arr.length);
        for(int t:arr)
        {
            System.out.println(t);
        }
    }
    public void varArgsMethod(String sample,int... var)
    {
        for(int t:var)
        {
            System.out.println(t);
        }
    }
    public void userType(Actor actor)
    {
        System.out.println("Actor name :"+actor.name);
        System.out.println("Actor age :"+actor.age);
        System.out.println("Actor totalmovie :"+actor.totalMovie);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{45,67,89,32};
        Actor act = new Actor();
        new MethodWithParameter().userType(act);

        new MethodWithParameter().add(4,5,arr);
        new MethodWithParameter().varArgsMethod("last parameter",1,2,3,4,5,6);
        new MethodWithParameter().varArgsMethod("last parameter",1,2,3,4,5,6,8,9,10,11);
        new MethodWithParameter().varArgsMethod("last parameter",new int[]{45,67,89,32});
        //new MethodWithParameter().varArgsMethod(1,2,3.56);//error
    }
}
