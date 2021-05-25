class StringImmutable
{
    public static void main(String[] args)
    {
        String s = "Welcome ";
        System.out.println("Before concat: "+s);
        System.out.println("s.concat(Bigboss 5) "+s.concat("Bigboss 5"));
        System.out.println("After concat: "+s);
        System.out.println("After Assignment: "+s);
    }
}