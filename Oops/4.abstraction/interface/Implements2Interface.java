interface Rbi
{
    public void accounts();
    public void loan();
}
interface Atm
{
    public void services();
}
interface Sbi extends Rbi, Atm
{
    public void loan();
}

class Customer implements Sbi
{
    public void accounts()
    {
        System.out.println("RBI Method");
    }
    public void loan()
    {
        System.out.println("SBI Method");
    }
    public void services()
    {
        System.out.println("Services Method");
    }
}

class Implements2Interface
{
    public static void main(String[] args)
    {
        Customer obj = new Customer();
        obj.accounts();
        obj.loan();
    }
}