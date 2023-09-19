public class patt{
    public static void main(String[] args){
        for (int i= 0; i<= rows-1; i++)  
        {  
            for (int j=0; j<=i; j++)    
            {  
                System.out.print(" ");  
            }  
            for (int k=0; k<=rows-1-i; k++)  
            {  
                System.out.print("*" + " ");  
            }  
            System.out.println();  
        }   
        for (i=0; i<row; i++)   
        {  
            for (j=row-i; j>1; j--)   
            {  
                //prints space between two stars  
                System.out.print(" ");   
            }   
            //inner loop for columns  
            for (j=0; j<=i; j++ )   
            {   
                //prints star      
                System.out.print("* ");   
            }   
            //throws the cursor in a new line after printing each line  
            System.out.println();   
        }   
    }  
}
