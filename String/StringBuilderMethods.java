class StringBuilderMethods
{
    public static void main(String[] args)
    {
            //StringBuilder sb = new StringBuilder();
            //StringBuilder sb = new StringBuilder(50);
            StringBuilder sb = new StringBuilder("Java ");
            System.out.println(sb.capacity());
            System.out.println(sb.length());
            sb.append("welcome");
            System.out.println(sb);
            sb.insert(4," incognito ");
            System.out.println(sb);
            //sb.insert(30," incognito ");
            sb.delete(8,14);
            System.out.println(sb);
            sb.deleteCharAt(3);
            System.out.println(sb);
            System.out.println(sb.substring(5,9));
            System.out.println(sb.capacity());
            sb.trimToSize();
            System.out.println(sb.capacity()+" "+sb.length());
    }
}