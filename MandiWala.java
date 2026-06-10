package day8;
import java.util.*;
import java.util.Scanner;
public class MandiWala {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        HashMap<String,Integer>Menu=new HashMap<String,Integer>();
        Menu.put("biryani",450);
           Menu.put("starters",600);
              Menu.put("butter chicken",399);
                 Menu.put("mandi",450);
              int totalBill=0;
              String choice;
              do{
                System.out.println("\nMenu:"+Menu);
                System.out.println("Enter item name");
                String items=sc.nextLine();
                if(Menu.containsKey(items)){
                    totalBill+=Menu.get(items);
                    System.out.println("Item added");
                }
                else{
                    System.out.println("item not available");
                }
                    System.out.println("do uh want to continue(yes/no):");
                    choice=sc.nextLine();

                  

            }
            while(choice.equals("yes"));
            System.out.println("order placed successfully");
            System.out.println("TotalBill="+totalBill);
                    

                }
              }

                 
                 


