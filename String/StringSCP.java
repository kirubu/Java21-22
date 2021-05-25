class StringSCP
{
    public static void main(String[] args)
    {
        String str = new String("Arr");
        String str1 = "Arr";
        String str2 = "Arr";

        System.out.println(str);
        System.out.println(str1);

        if(str.equals(str1))//if(str == str1)
            System.out.println("str1 & str Equal");
        else
            System.out.println("str1 & str Equal");

        if(str2 == str1)
            System.out.println("str1 & str2 Equal");
        else
            System.out.println("str1 & str2 NotEqual");
    }
}