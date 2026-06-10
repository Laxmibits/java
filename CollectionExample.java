package day8;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("Apple");
        stack.push("Mango");
        stack.push("Orange");
        stack.push("Kiwi");
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
        System.out.println(stack.indexOf("Orange"));
    
}
}
