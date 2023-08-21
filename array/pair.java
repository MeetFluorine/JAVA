import java.util.*;
public class pair{
    // public static void PrintArray(int num[]){
    //     for(int i=0;i<num.length;i++){
    //         System.out.print(num[i]+" ");
    //     }
    //     System.out.println("");
    // }
    public static void pairArray(int num[]){
        for(int i=0;i<num.length;i++){
            int curr = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + curr + ","+num[j]+") "); 
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements:-");
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("num[" + i+"]=");
            num[i]=sc.nextInt();
        }
        pairArray(num);
    }
}