import java.util.*;
public class linearSearch{
    public static int linearSrch(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
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
        int index = linearSrch(num,key);
        if(index==-1){
            System.out.print(key + " Not found in the list");
        }
        else{
            System.out.println(key+ " found at index "+ index);
        }

        
    }
}