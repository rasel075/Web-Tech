import  java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("Enter integer: ");
        int n=input.nextInt();
        int row,col;
        
        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)
            {
                IO.print("*");
            }
            
            
            IO.println();
        }
        IO.println();
        for(row=n;row>0;row--)
        {
            for(col=0;col<row;col++)
            {
                IO.print("*");
            }
            
            IO.println();
        }
        IO.println();
        for(row=0;row<n;row++)
        {
            for(col=row;col<n-1;col++)
            {
                IO.print(" ");
            }
            for(col=0;col<=row;col++)
            {
                IO.print("*");
            }
            IO.println();
        }
        IO.println("...............\n\n");

        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)
            {
                IO.print("*");
            }
             for(col=row;col<n-1;col++)
            {
                IO.print("  ");
            }
            for(col=0;col<=row;col++)
            {
                IO.print("*");
            }
            
            IO.println();
        }
        IO.println("...............\n\n");

        for(row=n;row>0;row--)
        {
            for(col=0;col<row;col++)
            {
                IO.print("*");
            }
             for(col=row;col<n;col++)
            {
                IO.print("  ");
            }
            for(col=0;col<row;col++)
            {
                IO.print("*");
            }
            
            IO.println();
        }

        IO.println("....Butterfly of Stars...........\n\n");

        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)
            {
                IO.print("*");
            }
             for(col=row;col<n-1;col++)
            {
                IO.print("  ");
            }
            for(col=0;col<=row;col++)
            {
                IO.print("*");
            }
            
            IO.println();
        }


        for(row=n-1;row>0;row--)
        {
            for(col=0;col<row;col++)
            {
                IO.print("*");
            }
             for(col=row;col<n;col++)
            {
                IO.print("  ");
            }
            for(col=0;col<row;col++)
            {
                IO.print("*");
            }
            
            IO.println();
        }

        IO.println("....Hollow Diamond of Stars...........\n\n");
        for(row=n;row>0;row--)
        {
            for(col=0;col<row;col++){
                IO.print("*");

            }
            for(col=row;col<n;col++){
                IO.print("  ");

            }
            for(col=0;col<row;col++){
                IO.print("*");

            }

            IO.println();
        }
        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++){
                IO.print("*");

            }
             for(col=row;col<n-1;col++){
                IO.print("  ");

            }
            for(col=0;col<=row;col++){
                IO.print("*");

            } 

            IO.println();
        }
        IO.println(".... Hollow Square of Stars...........\n\n");
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {   
                if(row==0||col==n-1||col==0||row==n-1)
                    System.out.print("*");
                else 
                    IO.print(" ");
            }

            
            
            
            IO.println();
        }
        IO.println(".... Hollow  Right Triangle of Stars...........\n\n");
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {   
                if(row==col || col==n-1 ||row==0 )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            
            IO.println();
        }
        IO.println(".... Hollow  Pyramid of Stars...........\n\n");
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {   
                if(col==n-1|| row==n-1 || (col+row)==n-1 )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            
            IO.println();
        }
        IO.println("...... Hollow Inverted Right Triangle of Stars.....\n\n");
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {   
                if(col==n-1|| row==0 || row==col )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            
            IO.println();
        }

        IO.println("......Hollow Pyramid of Stars.....\n\n");
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {   
                if(row==n-1 || row+col==n-1 )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            for(col=1;col<n;col++)
            {   
                if(row==n-1 || row==col )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            
            IO.println();
        }
        IO.println("...... Hollow Inverted Pyramid of Stars.....\n\n");
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {   
                if(row==0 || row==col )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            for(col=1;col<n;col++)
            {   
                if(row==0 || row+col==n-1 )
                    System.out.print("*");
                else 
                    IO.print(" ");
            }
            
            
            IO.println(); 
            //i can learn github
        }

     IO.println("......  Hollow Right Pascal Triangle.....\n\n");
      for(row=0;row<n;row++){
              
        for(col=row;col<n-1;col++){
            IO.print(" ");
        }
        for(col=0;col<=row;col++){
             if(col==row||  col+row==row)
               IO.print("*");
            else 
                IO.print(" "); 
             
        }
        
        IO.println();
      } 

      

      for(row=n-1;row>0;row--){
              
        for(col=row;col<n;col++){
            IO.print(" ");
        }
        for(col=0;col<row;col++){
             if(col+1==row||  col==0)
               IO.print("*");
            else 
                IO.print(" "); 
             
        }
        
        IO.println();
      } 

    }
}