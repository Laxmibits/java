package day7;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("HI");
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
            
        }
        
        System.out.println("bye");
    }
    
}
