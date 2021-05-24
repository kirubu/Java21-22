import java.io.*;
class BufferIO
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int intVar = Integer.valueOf(str);
        System.out.println(intVar);
        str = br.readLine();
        float floatVar = Float.parseFloat(str);
        System.out.println(floatVar);
        str = br.readLine();
        boolean booleanVar = Boolean.valueOf(str);
        System.out.println(booleanVar);
    }
}