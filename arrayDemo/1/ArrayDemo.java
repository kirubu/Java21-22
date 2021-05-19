import java.util.Scanner;
class ArrayDemo
{
    public static void main(String[] args) 
    {
        int[] ar;
        int a;
        //System.out.print(a);
        //System.out.print(ar);//error
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //float[] arr = new float[n];
        //boolean[] arr = new boolean[n];
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+", ");
        System.out.println();

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println();
        
        //System.out.println(arr[30]);//Generate ArrayIndexOutOfBoundsException
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+", ");
        System.out.println();
    }
}