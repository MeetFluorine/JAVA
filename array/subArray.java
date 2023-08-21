
import java.util.*;

public class subArray{
    public static void subArrayPrint(int num[]){
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j = i;j<num.length;j++){
                int end = j;

                for(int k =start ; k<= end ;  k++){
                    System.out.print("["+num[k]+"] ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int n = sc.nextInt();
        int num[]=  new int[n];
        for(int i =0;i<n;i++){
            System.out.print("num["+i+"]=");
            num[i]= sc.nextInt();
        }
        subArrayPrint(num);
    }
}