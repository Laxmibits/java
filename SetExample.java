package day8;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer>s=new HashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.remove(50);
        System.out.println(s);

    }
    
    
}
