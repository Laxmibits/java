import java.util.Scanner;
public class SumOfDiagonal {
    public static void main(String args[]){
    int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
     int rsum=0,lsum=0;
      for(int i=0;i<3;i++)
        {
            
            for(int j=0;j<3;j++)
                {
                    if(i+j==mat.length-1)
                    {
                        rsum+=mat[i][j];
                    }
                }  
    }
    
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(i==j){
                        lsum+=mat[i][j];
                    }
                }
            }
                
                   
    System.out.println(lsum+rsum);
    
}
}
