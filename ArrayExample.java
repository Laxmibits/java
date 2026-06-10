import java.util.Scanner;
class ArrayExample{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Elements are: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}