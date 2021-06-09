class FinalVariable
{
    final static int a = 90; // final variable will consider as a constent & must be initialized with some value
                 // if final variable is not initailized we will get compile time error
    public static void main(String[] args)
    {
        FinalVariable obj = new FinalVariable();
        final int a = 60;
        System.out.println(obj.a);        
        System.out.println(a); 
    }
}