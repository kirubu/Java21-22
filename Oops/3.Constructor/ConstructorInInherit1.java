class Ott
{
    String name;
    Ott()
    {
        System.out.println("Base Contructor");
    }
    Ott(String name)
    {
        System.out.println("Base overloaded Contructor");
        this.name = name;
    }
}
class Netflix extends Ott
{
    int movie;
    Netflix()
    {
        System.out.println("Child Contructor");
    }
    Netflix(int movie)
    {
        System.out.println("Child overload Contructor");
        this.movie = movie;
    }
}
class User extends Netflix{}
class ConstructorInInherit1
{
    public static void main(String[] args)
    {
        Netflix obj = new Netflix(23);
        Ott ottObj = new Ott();
    }
}