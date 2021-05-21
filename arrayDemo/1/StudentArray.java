class Student
{
    int rNo;    String name;
    Student(int rno, String name)
    {
        this.rNo = rno;
        this.name = name;
    }
}
class StudentArray
{
    public static void main(String[] args) 
    {
        /* String[] arr = new String[5];
        Integer[] intArr = new Integer[5]; 
        Student std = new Student(45,"EzExam");
        */
        /* Student std = new Student(45,"EzExam");
        System.out.print(std.rNo+" "+std.name); */
        Student[] stdArr = new Student[5];
        for(int i=0;i<5;i++)
        {
            stdArr[i] = new Student(i+10,"Student"+i);
        }
        System.out.println("-------Using ForEach Loop--------");
        for(Student temp:stdArr) 
        {
            System.out.println(temp.rNo+" "+temp.name);
        }
        System.out.println("-------Traditional For Loop--------");
        for(int i=0;i<5;i++)
        {
            System.out.println(stdArr[i].rNo+", "+stdArr[i].name);
        }
        System.out.println("-------Using ForEach Loop*****Object Class*****--------");
        for(Object obj:stdArr)
        {
            Student std = (Student) obj;//typecasting Object type to Student type
            System.out.println(std.rNo+" "+std.name);
        }
    }
}