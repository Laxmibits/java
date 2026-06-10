package day6;
class Electronics{
    public void turnOn(){
        System.out.println("Devices has turned on...");
    }


}
class SmartPhone extends Electronics{
    public void takeSelfie(){
        System.out.println("woow its nice pic!");
    }
}

public class SingleInheritance {
    public static void main(String args[]){
        SmartPhone iphone = new SmartPhone();
        iphone.takeSelfie();
        iphone.turnOn();
        

    }
    
}
