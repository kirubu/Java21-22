class MethodWithReturnType
{
    static int plus = add(45,78);
    public static void main(String[] args)
    {
        int b = add(4,5);
        System.out.println(b);
        int[] arr = returnArray(new int[]{23,45,56,67});
        for(int t:arr)
            System.out.println(t);
    }
    public static int add(int a, int b)
    {
        int x;
        x = a*b;
        return x;
    }
    public static int[] returnArray(int[] arr)
    {
        int i = 0;
        for(int t:arr)
            arr[i++] = t*100;
        return arr;
    } 
}