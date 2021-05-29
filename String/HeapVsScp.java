class HeapVsScp
{
    public static void main(String[] args)
    {
        String s1 = new String("Spring");
        s1.concat("Hibernate");
        String s2 = s1.concat("winter");
        s2.concat("Summer");
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "my Session";
        String s4 = "my ";
        String s5 = "my Session";
        s4 = s4.concat("Session");
        System.out.println(s3==s4);//false
        System.out.println(s3==s5);//true
        String s6 = new String("my Session");
        System.out.println(s6==s4);//false
    }
}