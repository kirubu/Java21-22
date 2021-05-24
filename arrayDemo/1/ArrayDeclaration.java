class ArrayDeclaration
{
    /* public static void main(String[] args)
    {
        //---Array is an object--
        int[] a,b,c;//a,b,c-->1D Array
        int []e,f,g;//e,f,g-->1D Array
        //int []p, []q, []s;//error-->2nd var dimension of array
                            //mentioned in leftside of variable 

        int i[], j[], k[];//can be written as -->int[] i,j,k;
        int x[], y[][], z[][][];

        x = new int[8];
        y = new int[9][3];
        z = new int[10][2][3];
        ArrayDeclaration ad = new ArrayDeclaration();
        System.out.println(ad);//print hashCode of object
        /* e = new int[5];
        f = new int[6];
        g = new int[7]; */

        /* a = new int[5];
        b = new int[6];
        c = new int[7]; */
        /* System.out.println(x);//print hashCode of array object
        System.out.println(x +" array size is "+x.length);
        //length is attribute for array-,not a method or keyword
        System.out.println(y +" array size is "+y.length);
        System.out.println(y +" array size is "+y[2].length);//return second row length
        System.out.println(z +" array size is "+z.length);    
    }
    */
     public static void main(String[] args) 
    {
        int[] []a,b,c;//A- 2D, B- 2D, C-2D
        int[] x[],y,z;//x- 2D, y- 1D, z- 1D
        int []i[],j,k;//i- 2D, j- 1D, k- 1D
        x = new int[3][3];
        y = new int[3];
        z = new int[3];
        /* a = new int[3][3];
        b = new int[3][3];
        c = new int[3][3]; */

        //int[][] a,b,c;
        //int [][]i,j,k;//int p,[][]q,[][]r;-wrong declaration
        //int x[][],y,z;
        
    } 
}
