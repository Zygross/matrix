import java.util.Scanner;
class matrix 
{
    public static void main ()
    {
        Scanner br=new Scanner (System.in);
        System.out.println ("Enter the number of rows");
        int M=br.nextInt ();
        System.out.println ("Enter the number of columns ");
        int N=br.nextInt ();
        if (M>2&&M<10&&N>2&&N<10)
        {
            int A[][]=new int [M][N];
            System.out.println ("Enter the elements of the array");
            for (int i=0;i<M;i++)
            {
                for (int j=0;j<N;j++)
                {
                    A[i][j]=br.nextInt ();
                    
                }
                System.out.println();
            }
            System.out.println ("The Matrix you have entered is ");
            for (int i=0;i<M;i++)
            {
                for (int j=0;j<N;j++)
                {
                     System.out.print(A[i][j]+" ");
                    
                }
                System.out.println();
            }
            System.out.println ("Formed matrix after rotating ");
             for (int i=1;i<M;i++)
             {
                 for (int j=0;j<N;j++)
                 {
                     System.out.print (A[i][j]+" ");
                 }
                 System.out.println();
                 
             }
             for (int j=0;j<N;j++)
             {
                 System.out.print (A[0][j]+" ");
             }
        }
        else 
        {
            System.out.println ("Invalid input");
        }
    }
}