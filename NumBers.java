import java.util.*;
public class NumBers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        IO.print("Input: ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int row,col,i,c;
        c=1;
        for(row=0;row<n1;row++)
        {
            for(col=0;col<n2;col++)
            {
                IO.print(c);
                if(c==9)
                    c=0;
                c++;
            }
            
            IO.println();
        }



    }
}