import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input: ");
        int n=input.nextInt();
        //int n2=input.nextInt();
        int row,col;
        // System.out.println("Character: ");
        /* for(row=0;row<n;row++){
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
        } */

            // Alternating Continuous Letter Rectangle
        /* char ch2='A';

        
        for(row=0;row<n;row++){
            if(row%2==0)
            {
                for(col=0;col<n2;col++){
                System.out.print(ch2);
                ch2++;
            }

           }
            else {
               char ch= (char)(ch2+n2-1);
                for(col=0;col<n2;col++){
                    System.out.print(ch);
                    ch--;
                }
                ch2=(char)(ch2+n2);

            }
            
             
            
            System.out.println();
        }

         for(row=0;row<n;row++){
           
            
            
            System.out.println();
        } */


            //3.29. Hollow Diamond of Letter Rectangle



/* 
             char ch='A';
             //char ch='A';

            for(row=n;row>0;row--){
              
                 for(col=0;col<row;col++){
                    System.out.print((char)(ch+col));
                    
                }
                 for(col=0;col<(2*n-row*2-1);col++)
                {
                    System.out.print(" ");
                }
                if(row==n){
                    char ch2=(char)('A'+row-2);
                for(col=1;col<row;col++){
                    System.out.print(ch2);
                    ch2--;
                }
                }
                else {
                     char ch2=(char)('A'+row);
                for(col=0;col<row;col++){
                    System.out.print(ch2);
                    ch2--;
                }
                }
                



                System.out.println();
                
            }

            for(row=0;row<n;row++){
              
                 for(col=0;col<=row;col++){
                    System.out.print((char)(ch+col));
                    
                }
                 for(col=0;col<(2*n-row*2-3);col++)
                {
                    System.out.print(" ");
                }
                if(row==n-1){
                    char ch2=(char)('A'+row-1);
                for(col=0;col<row;col++){
                    System.out.print(ch2);
                    ch2--;
                }
                }
                else {
                     char ch2=(char)('A'+row);
                for(col=0;col<=row;col++){
                    System.out.print(ch2);
                    ch2--;
                }
                }
                



                System.out.println();
                
            }  */

           //.30. Hollow Letter Square
           /* char ch='Z';
           for(row=0;row<n;row++){
              
                

                
                 for(col=0;col<n;col++){

                    if(row==0||row==n-1||col==0||col==n-1){
                        
                    System.out.print((ch));
                    ch--;

                    }
                    else {
                        System.out.print(" ");
                    } */
                  
       input.close();
    
    }
}
