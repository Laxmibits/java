import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int sum=0,r;
        int n=1634;
        int temp=n;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp == sum){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }


        }
       

        

    }
