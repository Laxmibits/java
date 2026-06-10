package day5;

public class Disk {
    public static void towerOfHanoi(int n,char s,char d,char a){
        if(n==0)
            return;
        else{
            towerOfHanoi(n-1,);
            System.out.println("Disk" +n+" transfer from "+s+"")
            towerOfHanoi(n-1,aux, s, d);
        }
    }
    public static void main(String args[]){
        System.out.println()
    }
}
