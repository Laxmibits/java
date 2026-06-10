import java.util.Scanner;
public class MatProblems {
    public static void main(String args[]){
        int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
    
}






// in inversermatrix:....change the System.out.print(mat[j][i] + " ");