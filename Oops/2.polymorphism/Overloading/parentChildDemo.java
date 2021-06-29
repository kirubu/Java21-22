class Animal{}
class Lion extends Animal{}

class parentChildDemo
{
    public void hunter(Animal a)
    {
        System.out.println("Animal class args");
    }
    public void hunter(Lion a)
    {
        System.out.println("Lion class args");
    }
    public static void main(String[] args)
    {
        parentChildDemo obj = new parentChildDemo();
        obj.hunter(new Animal());
        obj.hunter(new Lion());
        Animal simba = new Lion();
        obj.hunter(simba);
        //Lion nala = new Animal();//Lion nala = (Lion)new Animal();
    }
}