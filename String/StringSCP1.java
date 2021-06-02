class StringSCP1
{
	public static void main(String[] args) 
	{
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");
		System.out.println(s1==s2);//false

		String s3 = "You cannot change me";
		System.out.println(s1==s3);//false

		String s4 = "You cannot change me";
		System.out.println(s4==s3);//true

		String s5 = "You cannot " + "change me";//compile time concat
		System.out.println(s4==s5);//true

		String s6 = "You cannot ";
		String s7 = s6+"change me";//runtime concat due s6
		System.out.println(s4==s7);//false

		final String s8 = "You cannot ";
		String s9 = s8+"change me";//compile time concate due final variable
		System.out.println(s4==s9);//true
	}
}