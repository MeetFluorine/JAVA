import java.util.Scanner;

    public class checkSorted {
      public static boolean check_sorted(int arr[], int x){
        boolean flag = true;
        for(int i =1;i<x;i++){
            if(arr[i]<arr[i-1]){
                flag =false;
                break;
            }
        }
        return flag;
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
        boolean p = check_sorted(arr,n);
        if(p==true){
            System.out.println("sorted");
        }
        else{
            System.out.println("unsorted");
        }
    }
}
