import java.util.Scanner;
public class Nestedif {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float cgpa=sc.nextFloat();
    if(cgpa>=7.5f)
    {
        int back=sc.nextInt();
        if(back<=2)
        {
            int coding=sc.nextInt();
            if(coding>=2)
            {
                int comm=sc.nextInt();
                if(comm>=60)
                {
                    System.out.println("Eligible for placement");
                }
                else{
                    System.out.println("Improve your skills");
                }
            }
            else{
                System.out.println("sorry, you need to clear coding");
            }
        }
        else{
            System.out.println("sorry, you need to clear backlogs");
        }
    }
        else{
            System.out.println("sorry, you need to clear cgpa");
        }
    }
}

