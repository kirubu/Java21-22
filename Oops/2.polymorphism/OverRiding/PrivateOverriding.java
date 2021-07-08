class Sbi
{
    private void balance()
    {
        System.out.println("Base");
    }
}
class Loan extends Sbi
{
    public void balance()
    {
        System.out.println("Base");
    }
}
class PrivateOverriding
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