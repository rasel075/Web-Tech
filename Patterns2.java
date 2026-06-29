import java.util.*;
public class Patterns2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("Enter number:  ");
        int n=input.nextInt();
        int row,col;
        System.out.println("Hollow Left Reverse Pascal Triangle\n\n");
        for(row=n;row>0;row--)
        {
            for(col=0;col<row;col++)
            {
                if(col==0||row==n|| col==row-1)
                IO.print("*");
            else IO.print(" ");

            }
            IO.println();
        }
        
         for(row=1;row<n;row++)
        {
            for(col=0;col<=row;col++)
            {
                if(col==0||row==n-1||row==col)
                IO.print("*");
            else IO.print(" ");

            }
            IO.println();
        }
        System.out.println("Hollow Left Reverse Pascal Triangle\n\n");
        for(row=n;row>0;row--)
        {
            for(col=row;col<n;col++)
            {
                IO.print(" ");
            }
            for(col=0;col<row;col++)
            {
                if(col==0||row==n|| col==row-1)
                IO.print("*");
            else IO.print(" ");

            }
            IO.println();
        }
        for(row=0;row<n;row++)
        {
            for(col=row;col<n-1;col++)
                {
                    IO.print(" ");
                }

            for(col=0;col<=row;col++)
            {
               if(col==row||col==0||row==n-1) 
                IO.print("*");
               else 
                IO.print(" ");
            }
            IO.println();
        }
        IO.println("\n\n\n");
        for(row=0;row<n;row++){
            for(col=row;col<n-1;col++)
            {
                IO.print(" ");
            }
            for(col=0;col<=row;col++)
            {
                if(col==0)
                System.out.print("*");
            else IO.print(" ");
            }
            for(col=1;col<=row;col++)
            {
                if(col==row)
                System.out.print("*");
                else 
                    IO.print(" ");
            }
            IO.println();
        }
        // IO.println("\n\n\n");

        for(row=n-1;row>0;row--){
            for(col=row;col<n;col++)
            {
                IO.print(" ");
            }
            for(col=0;col<row;col++)
            {
                if(col==0)
                System.out.print("*");
            else IO.print(" ");
            
            }
            for(col=1;col<row;col++)
            {
                if(col==row-1)
                System.out.print("*");
             else IO.print(" ");
                
            
            }
            
            IO.println();
        }

    }
}
