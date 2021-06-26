class AmbigiousOL
{
    public void doNut(int i, double f)
    {
        System.out.println("int,double");
    }
    public void doNut(double f, int i)
    {
        System.out.println("double,int");
    }
    public void doNut(float f, int i)
    {
        System.out.println("double,int");
    }
    public static void main(String[] args)
    {
        AmbigiousOL obj = new AmbigiousOL();
        obj.doNut(23,34.45);
        obj.doNut(45.32,34);
        obj.doNut(23,23);
    }
}