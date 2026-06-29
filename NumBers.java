import java.util.*;
public class NumBers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("ENter a NumBer: ");
        int n=input.nextInt();
        int row,col,c=0;
        for(row=0;row<n;row++)
        {
            for(col=row;col<n-1;col++)
            {
                IO.print(" ");
            }
            for(col=0;col<n;col++)
            {
                IO.print(col+1);

                
            }
            IO.println();
        }

    }
    
}
