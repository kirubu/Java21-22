//javac -d . Math.java-->command to create package in current folder(directory)
package arithmetic;
public class Math
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int subtract(int a, int b)
    {
        return a-b;
    }
    public int divide(int a, int b)
    {
        if(a==0 || b==0)
        return -1;
        else
        return a/b;
    }
    public int multiply(int a, int b)
    {
        return a*b;
    }
}