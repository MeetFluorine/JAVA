import java.util.Scanner;

public class targetSum {
      public static void target_sum(int arr[], int x){
        int n = arr.length-1;
        
        for(int i =0;i<=n;i++){
            for(int j =i+1;j<=n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i] +"+" +arr[j]+"="+x);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter elements:-");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("enter the a value:-");
        int x = sc.nextInt();
        target_sum(arr, x);
    }
}
