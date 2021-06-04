class StringBuilderDemo
{
    public static void main(String[] args)
    {
            StringBuilder sb = new StringBuilder();
            System.out.println(sb);
            System.out.println(sb.capacity());
            String s = new String(" ");
            sb.append("welcome");
            s = s.trim().concat("welcome");
            
            /* if(sb==s)//error --> incomparable types: StringBuilder and String
            {
            System.out.println("true");
            } */

            boolean res = sb.equals(s)?true:false;
            System.out.println(res);
            System.out.println(sb.reverse());
            //System.out.println(s.reverse());

            res = sb.toString().equals(s)?true:false;
            System.out.println(res);
            System.out.println(sb.reverse());
    }
}