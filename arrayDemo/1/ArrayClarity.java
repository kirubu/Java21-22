class Actor{
    int ac;
}
class ArrayClarity
{
    String str;
    public static void main(String[] args) 
    {
        Actor[] act = new Actor[5];
        for(Actor temp:act)    
            System.out.println(temp);
            
        int[] arr = new int[5];
        float[] fArr = new float[5];
        boolean[] bArr = new boolean[5];
        String[] sArr = new String[5];
        for(int temp:arr)    
            System.out.println(temp);
        for(float temp:fArr)    
            System.out.println(temp);
        for(boolean temp:bArr)    
            System.out.println(temp);
        for(String temp:sArr)    
            System.out.println(temp);
        ArrayClarity ac = new ArrayClarity();
        System.out.println(ac.str);
    }
}