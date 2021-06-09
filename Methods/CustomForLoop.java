class CustomForLoop
{
    public static boolean check(int i)
    {
        System.out.println(i<5);
        return i<5;
    }
	public static void main(String[] args) {
	    for(int i=0;check(i);System.out.println(i++))
	    {
		 System.out.println("Hello World");
	    }
	}
}
