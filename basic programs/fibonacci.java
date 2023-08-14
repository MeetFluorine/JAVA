import java.util.*;
class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t1=0 ,t2=1, nextTerm;
        System.out.print("enter the number of term you want:-"); 
        int n= sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(t1+ " ");
            nextTerm= t1+t2;
            t1=t2;
            t2= nextTerm;
        }
    }
}