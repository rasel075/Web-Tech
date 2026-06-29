import java.util.*;
public class NumBers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("ENter a NumBer: ");
        int n=input.nextInt();
        int row,col,c=0;
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                if(row==0||row==n-1||col==0||col==n-1)
                    IO.print(c+1);
                else IO.print(0);

                
            }
            IO.println();
        }

    }
    
}
