class Sbi
{
    public void credit(Object a)//int//int
    {
        System.out.println("Parent "+a);
    }
}
class Atm extends Sbi
{
   public void credit(String a)//int//float
    {
        System.out.println("Child "+a);
    } 
}
class ParameterOverriding
{
    public static void main(String[] args)
    {
        Sbi objp = new Sbi();
        objp.credit(new Object());
        Atm objc = new Atm();
        objc.credit(new String());
        Sbi objd = new Atm();
        objd.credit(null);
    }
}