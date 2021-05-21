import java.util.Scanner;
class ForEach
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String[] arr = new String[n];
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        //ForEachLoop - used only for array & collection objects
        //--------Syntax----------------
        /* for(loop variable:arrayObject){

        } */

        for(int temp:arr)
        {
            System.out.println(temp+" "+(temp*100));
        }
        /* for(String temp:arr)
        {
            System.out.println(temp+" "+temp.toUpperCase());
        } */
        
    }
}