import java.util.Scanner;

public class noOfOccurance {

    public static int check_Occurance(int arr[], int x){
        int n = arr.length-1;
        int count =0;
        for(int i =0;i<=n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;adddin
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
        System.out.print("enter the number to check last accurance:-");
        int x = sc.nextInt();
        System.out.println(x+" is present "+ check_Occurance(arr,x)+"times");
    }

}

