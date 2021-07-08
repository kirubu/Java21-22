class Sbi
{
    public void balance()
    {
        System.out.println("Base");
    }
}
class Loan extends Sbi
{
    public final void balance()
    {
        System.out.println("Base");
    }
}
class PersonalLoan extends Loan
{
    //cannot over final method balance
}
class FinalOverriding
{
    public static void main(String[] args)
    {
        Sbi objb = new Sbi();
        objb.balance();
        Loan objc = new Loan();
        objc.balance();
        Sbi objd = new Loan();
        objd.balance();
    }
}