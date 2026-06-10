package day7;
import java.io.*;
import java.util.Scanner;
public class ReadingDataFromFile {
    public static void main(String[] args) {
        try{
            File file=new File("demo.txt");
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
            String data=reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }
    catch(IOException e){
        System.out.println();
    }
}
}
