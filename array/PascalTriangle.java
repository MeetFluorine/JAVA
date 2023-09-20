import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:-");
        int n = sc.nextInt();
        int mat[][] = new int[n][];
        for(int i=0;i<n;i++){
            mat[i]= new int[i+1];
            mat[i][0]= mat[i][i] =1;
            for(int j =1;j<i;j++){
                mat[i][j] = mat[i-1][j] +mat[i-1][j-1];
            }
            
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
