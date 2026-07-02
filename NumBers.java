import java.util.*;
public class NumBers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("ENter a NumBer: ");
        int n=input.nextInt();
        int row,col,c=n;
        for(row=0;row<n;row++)
        {
            
            for(col=row;col<n-1;col++)
            {
                IO.print(" ");
            }
            for(col=0;col<=row;col++)
            {
                
                
                IO.print(col+1);
                c++;
                
            }
            for(col=row-1;col>=0;col--)
            {
                c=0;
                
                IO.print(col+1);
                c++;
                
            }

            c=0;;
            IO.println();
        }
        System.out.printf("%n%n%n");
        for(row=0;row<n;row++){
            for(col=row;col<n-1;col++)
            {
                IO.print(" ");
            }c=n;
            for(col=0;col<=row;col++){

                IO.print(c);
                c--;
            }
            
            for(col=1;col<=row;col++){

                IO.print(c+2);
                c++;
            } 
            
            IO.println();
        }
         System.out.printf("%n%n%n");
        c=2;
        for(row=0;row<n;row++)
        {
            for(col=0;col<=row;col++)
                {
                    IO.print(c+" ");
                c+=2;
                }
            IO.println();
        } 

        System.out.printf("%n%n%n");
        
        for(row=n;row>0;row--)
        {
            for(col=row;col<n;col++)
                {
                    IO.print(" ");
                }
                c=n;
            for(col=0;col<row;col++)
                {
                    IO.print(c);
                    c--;
                
                }
                
                c+=2;
             for(col=1;col<row;col++)
                {
                    IO.print(c);
                    c++;
                
                } 
                
                
            IO.println();
        }
        

System.out.printf("%n%n%n");

for(row=0;row<n;row++)
{
    for(col=row;col<n-1;col++)
    {
        IO.print(" ");
    }c=1;
    for(col=0;col<=row;col++)
    {
        IO.print(c);
        c++;
    }
    c-=2;

    for(col=1;col<=row;col++)
    {
        IO.print(c);
        c--;
    }
    IO.println();

}
//System.out.println();
for(row=n-1;row>0;row--)
{
    for(col=row;col<n;col++)
    {
        IO.print(" ");
    }c=1;
    for(col=0;col<row;col++)
    {
        IO.print(c);
        c++;
    }
    c-=2;

    for(col=1;col<row;col++)
    {
        IO.print(c);
        c--;
    }
    IO.println();

}

System.out.printf(" %n%n%n");

for(row=0;row<n;row++){
     for(col=row;col<n;col++)
    {
        IO.print(" ");
    }
    c=n;
    for(col=0;col<=row;col++)
    {
        IO.print(c);
        c--;
    }
    c+=2;

     for(col=1;col<=row;col++)
    {
        IO.print(c);
        c++;
    } 
    IO.println();
}
int start,i;

IO.println();
for(row=0;row<n;row++){
    c=n;
    for(col=0;col<=row;col++)
    {
        IO.print(c);
        c--;
    }
    for(col=0;col<2*(n-row)-3;col++)
    {
        IO.print(" ");

    }
    start=c+1;
    if(start==1)
            start=2;
    for(i=start;i<=n;i++)
    {
        
        
        IO.print(i);
        
    }
    IO.println();
}
/*  for(row=0;row<n;row++){
    
    for(col=row;col<n-1;col++)
    {
        IO.print(" ");

    }
    c=n;
    for(col=0;col<=row;col++)
    {
        IO.print(c);
        c--;
    }
    IO.println();
} */
///Inverted Twin Peaks of Numbers
IO.println("\nTwin Peak\n");
c=n;
for(row=n;row>0;row--)
{
    
     for(col=0;col<row;col++)
        {
            IO.print(c);
            c--;
        }
        
        for(col=0;col<2*(n-row)-1;col++){
        IO.print(" ");
    }

    start=c+1;
    if(start==1)start=2;
     for(i=start;i<=n;i++)
        {
            IO.print(i);
            
        }
        c=n;
        IO.println();
}
/* IO.println("\nTwin Peak\n");
c=n;
for(row=n;row>0;row--)
{
    for(col=row;col<n;col++){
        IO.print(" ");
    }

    
     for(col=0;col<row;col++)
        {
            IO.print(c);
            c--;
        }
        c=n;
        IO.println();
}
 */


    }
    
}
