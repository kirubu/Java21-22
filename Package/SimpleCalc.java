import arithmetic.Math;
import arithmetic.AdvanceMath;
class SimpleCalc
{
    public static void main(String[] args)
    {
        Math math = new Math();
        System.out.println(" add "+math.add(2,3));
        System.out.println(" sub "+math.subtract(2,3));
        System.out.println(" divide "+math.divide(2,3));
        System.out.println(" divide "+math.divide(2,0));
        System.out.println(" multiply "+math.multiply(2,9));

        AdvanceMath ad = new AdvanceMath();
        System.out.println(" square "+ad.sqaure(20));
        System.out.println(" cube "+ad.cube(15));
        System.out.println(" pow "+ad.pow(15,5));
    }
}