import java.util.*;
public class NumBers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("ENter Number: ");
        int n=input.nextInt();
        int row,col,i,c;
        c=11;
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                IO.print(c+" ");
                c++;
            }
            c+=5;
            IO.println();
        }



    }
}