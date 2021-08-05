class MSOffice
{
    int version;
    MSOffice()
    {
        super();
        this.version = 2022;
        System.out.println("Base Default Constructor");
    }
    MSOffice(int version)
    {
        System.out.println("Base parameter Constructor "+version);
        this.version = version;
    }
    public void purchase()
    {
        System.out.println("Base class method");
    }
}
class Doc extends MSOffice
{
    String pulgin;
    Doc()
    {
        super(2019);
        System.out.println("Child Default Constructor"+super.version);
    }
    Doc(String pulgin)
    {           
        this();
        this.pulgin = pulgin;
        System.out.println("Child parameter Constructor");
    }
    public void purchase()
    {
        super.purchase();
        System.out.println("Child class method");
        System.out.println("Child class method "+super.version);
    }
}
class SuperCall
{
    public static void main(String[] args)
    {
        Doc obj = new Doc("Grammerly");
        obj.purchase();
    }
}