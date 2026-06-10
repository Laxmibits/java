package day8;
import java.util.*;

public class OnlineShoping {
    public static void main(String[] args) {
        List<String> products=new ArrayList<>();
        products.add("Moblie");
        products.add("Laptop");
        products.add("AC");
        products.add("Microwave");
        products.remove(0);
        products.remove("AC");
        System.out.println(products.size());
        System.out.println(products.isEmpty());
    }

    
}
