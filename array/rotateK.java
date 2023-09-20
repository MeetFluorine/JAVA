import java.util.Scanner;

public class rotateK {
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swapArray(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void reverseArray(int arr[], int i ,int j){
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:-");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number of roatation:-");
        int k = sc.nextInt();
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,0,n-1);
        printArray(arr);
    
    }
}
