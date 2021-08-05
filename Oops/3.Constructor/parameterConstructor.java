class parameterConstructor
{
    int a,b,c;
    parameterConstructor(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void main(String[] args)
    {
        parameterConstructor pc = new parameterConstructor(45,67,78);
        System.out.println(pc.a);
        System.out.println(pc.b);
        System.out.println(pc.c);
    }
}