import java.util.*;
public class NumBers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("ENter a NumBer: ");
        int n=input.nextInt();
        int row,col,c=0;
        for(row=n;row>0;row--)
        {
           /*  c++;
            for(col=row;col<n;col++)
            {
                IO.print(" ");
            } */
            for(col=0;col<n;col++)
            {
                c++;
                IO.print(c +""+ c);
                
            }

            c=0;
            IO.println();
        }

    }
    
}
