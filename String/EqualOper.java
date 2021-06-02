class Student{int i;}
class EqualOper
{
    public static void main(String[] args)
    {
        Student std = new Student();
        Student std1 = new Student();
        System.out.println(std==std1);
        System.out.println(std+" "+std1);

        String str = new String("hai");
        String str1 = new String("hai");
        System.out.println(str==str1);
        System.out.println(str);
        int z = 10, x= 10;
        System.out.println(x==z);

        Integer itr = new Integer(45);
        Integer itr1 = new Integer(45);
        System.out.println(x==z);
        System.out.println(x);
    }
}