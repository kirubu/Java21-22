import java.util.Scanner;
import java.io.*;
class TypePromotionOL
{
    public void cupCake(int i)
    {
        System.out.println("1 int args");
    }

    public void cupCake(float i)//change float to double
    {
        System.out.println("1 double args");
    }

    public static void main(String[] args)
    {
        TypePromotionOL obj = new TypePromotionOL();
        obj.cupCake(12);
        //obj.cupCake(12.34);//obj.cupCake((float)12.34);//obj.cupCake((int)12.34);
        obj.cupCake(12.45f);
        obj.cupCake(12L);
        Scanner sc = new Scanner(new File("open.txt"));
    }

}