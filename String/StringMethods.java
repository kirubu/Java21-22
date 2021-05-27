class StringMethods
{
    public static void main(String[] args)
    {
        String s1 = "Always-choose-good";
        char temp = s1.charAt(2);
        //for(int i=0;i<s1.length();i++)
            //System.out.println(Character.isLetter(s1.charAt(i)));
        System.out.println(temp);
        
        char[] s1Arr = s1.toCharArray();
        System.out.println(s1Arr.length);

        String s2 = "Always-Choose-Good";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("A.comapreTo(Z): "+ "A".compareTo("Z"));
        System.out.println("Z.comapreTo(A): "+ "Z".compareTo("A"));
        System.out.println("A.comapreTo(A): "+ "A".compareTo("A"));
        
        s1 = "good"; s2 = "gOd";//"good";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

    }

}