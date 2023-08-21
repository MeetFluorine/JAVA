import java.util.*;
public class reverse{
    public static void PrintArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
    }
    public static void reverseArr(int num[]){
        int first = 0, last = num.length-1;
        while(first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
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
        System.out.println("before reverse Array elements are:-");
        PrintArray(num);
        reverseArr(num);
        System.out.println("after reverse Array elements are:-");
        PrintArray(num);

               
    }
}