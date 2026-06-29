import java.util.*;
public class NumBers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("ENter a NumBer: ");
        int n=input.nextInt();
        int row,col;
        for(row=n;row>0;row--)
        {
            for(col=n;col>0;col--)
            {
                IO.print(col);
            }
            IO.println();
        }

    }
    
}
