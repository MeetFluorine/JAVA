import java.util.*;
public class occurance{
    public static void binSearch(int num[], int key){
        int first=0,last = num.length-1,ans=0;
        while(first<=last){
            int mid= (first + last)/2;
            // check
            if(num[mid]==key){
                ans = mid;
            }
            else if(num[mid]<key){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
         System.out.println(key+ " found at index "+ ans);
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
        System.out.print("enter number to search:-");
        int key = sc.nextInt();
        binSearch(num,key);
        // if(index==-1){
        //     System.out.print(key + " Not found in the list");
        // }
        // else{
        //     System.out.println(key+ " found at index "+ index);
        // }

        
    }
}