import java.util.*;

public class maxSubArraySum{
    public static void subArraySum(int num[]){
        int curr_sum=0, maxSum= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j = i;j<num.length;j++){
                int end = j;
                curr_sum =0;
                for(int k =start ; k<= end ;  k++){
                    curr_sum += num[k];
                }
                System.out.print(curr_sum+ " ");
                if(curr_sum>maxSum){
                    maxSum = curr_sum;
                }
            }
        }
        System.out.println("\nmax Sub array sum = "+ maxSum);
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
        subArraySum(num);
    }
}