class Terminal
{
    int no;String name;
    Terminal()
    {
        this();
        System.out.println("Base default constructor");
    }
    Terminal(int nos)
    {
        this(90,"welcome");
        this.no = nos;
        System.out.println("Base overload constructor");
    }
    Terminal(int no,String name)
    {
        this.no = no;
        this.name = name;
        System.out.println("Base overload 2 constructor");
    }
}
class ThisCall
{
    public static void main(String[] args)
    {
        Terminal obj = new Terminal();
        System.out.println();
        //Terminal obj1 = new Terminal(78);
    }
}