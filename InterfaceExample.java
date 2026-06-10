package day6;
interface Animal{
    int legs=4;
    public void eat();
    public void sound();
}
class Cat implements Animal{
    public void eat(){
        System.out.println("Cat eats fish...");
    }
    public void sound(){
        System.out.println("Cat sounds as meoow");
    }
}
class Lion implements Animal{
    public void eat(){
        System.out.println("Lion eat flesh");
    }
    public void sound(){
        System.out.println("Lion sounds as roar");
    }
}









public class InterfaceExample {
    public static void main(String args[]){
        Lion lobj=new Lion();
        lobj.eat();
        lobj.sound();
        Cat cobj=new Cat();
        cobj.eat();
        cobj.sound();
    }
}
