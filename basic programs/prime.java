import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number- ");  
        int num= sc.nextInt();
        int i;
        for ( i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(num + " is not a prime number");
                break;
            }
        }
        if(i==num)
        {
            System.out.println(num + " is a prime number");
            
        }
    }
}