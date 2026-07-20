import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input: ");
        int n=input.nextInt();
        //int n2=input.nextInt();
        int row,col;
        // System.out.println("Character: ");
        for(row=0;row<n;row++){
            for(col=row;col<n-1;col++)
            {
                System.out.print(" ");
            }
            for(col=0;col<=row;col++)
            {
                System.out.print((char)('A'+col));
            }
            
            char ch=(char)('A'+row-1);
            for(col=0;col<row;col++)
            {
                System.out.print(ch);ch--;
            }
            System.out.println();
        }

        
        for(row=n-1;row>0;row--){
            for(col=row;col<n;col++)
            {
                System.out.print(" ");
            }
            for(col=0;col<row;col++){
                System.out.print((char)('A'+col));
            }
             char ch=(char)('A'+row-2);
            for(col=1;col<row;col++){
                System.out.print(ch);
                ch--;
            }
            
            System.out.println();
        }

        /* for(row=0;row<n;row++){
           
            
            
            System.out.println();
        } */







       input.close();
       
    
}
}
