import java.util.Scanner;

public class LastOccurance{
    public static int find_index(int arr[], int x){
        int n = arr.length-1;
        int last_oc =-1;
        for(int i =0;i<n;i++){
            if(arr[i]==x){
                last_oc =i;
            }
        }
        return last_oc;
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
        System.out.println(x+" is last present at array["+find_index(arr,x)+"]");
    }

}