class StringImmutable2
{
    public static void main(String[] args)
    {

        Integer i1 = new Integer(45);
        Integer i2 = new Integer(45);
        if(i1==i2)
        String s = "Welcome ";
        String s1 = new String("Welcome ");
        
        s = s.concat("Bigboss 5");
        s1 = s1.concat("Bigboss 6");

        String s2 = new String("Welcome Bigboss 6");

        if(s == s1)
            System.out.println("Both are same");
        else
            System.out.println("Both are not same");

        if(s2 == s1)
            System.out.println("Both are same");
        else
            System.out.println("Both are not same");
        
        if(s2.equals(s1))
            System.out.println("Both are same");
        else
            System.out.println("Both are not same");
    }
}