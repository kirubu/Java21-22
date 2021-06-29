class Loan
{
    public void rbi()
    {
        System.out.println("Base RBI Method");
    }
    public void personalLoan()//overridden method
    {
        System.out.println("Base Method");
    }
}
class Sbi extends Loan
{
    public void sbiRules()
    {
        System.out.println("Child SBI Method");
    }
    public void personalLoan()//overriding method
    {
        System.out.println("Child Method");
    }
}
class OverRideBasic
{
    public static void main(String[] args)
    {
        Loan bObj = new Loan();
        bObj.personalLoan();

        Sbi sbObj = new Sbi();
        sbObj.personalLoan();

        Loan loObj = new Sbi();
        loObj.personalLoan();
        loObj.rbi();
        //loObj.sbiRules();//compile time error
    }
}