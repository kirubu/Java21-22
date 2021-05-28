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

        s1 = "meet.google.com is sharing your screen";
        System.out.println(s1.startsWith("meet"));
        System.out.println(s1.endsWith("meet"));

        System.out.println(s1.indexOf('s'));
        System.out.println(s1.indexOf('z'));
        System.out.println(s1.lastIndexOf('s'));

        String tempSub = s1.substring(12);//StringIndexOutOfBoundsException-invalid index, index in decreasing order
        String tempSub1 = s1.substring(12,16);
        System.out.println(tempSub);
        System.out.println(tempSub1);

        System.out.println(s1.replace("o","0"));
        System.out.println(s1.contains("zoom"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        s1 = "meet.google.com is sharing your screen";
        String[] splitArr = s1.split(" ");
        for(String t:splitArr)
            System.out.println(t);
        String joinStr = String.join(" Yahoo ",splitArr);
        System.out.println(joinStr);

        String s3 = "  trim the string   ";
        System.out.println("Berofe trim()-->"+s3.length());
        System.out.println("After trim()-->"+s3.trim().length());



    }

}