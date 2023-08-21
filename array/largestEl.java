import java.util.*;
public class largestEl{
    public static int largestElm(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;

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
        int max = largestElm(num);
        System.out.println(max + " is largest number in this  list");
    }
}   