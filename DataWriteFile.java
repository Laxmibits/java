package day7;
import java.io.*;

public class DataWriteFile {
    public static void main(String[] args) {
        try{
        File file=new File("demo.txt");
        FileWriter Writer=new FileWriter(file,true);
        Writer.write("hello good afternoon!\n");
        Writer.write("this is BITS\n");
        Writer.write("teaching to 4 year students!\n");
        Writer.write("new data got added\n");
        Writer.close();
        System.out.println("data written successfully");
    }
    catch(IOException e){
        System.out.println("Issue while writing data into file");
    }

    
}
}
