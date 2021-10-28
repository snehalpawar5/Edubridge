import java.util.*;
public class DiagonalDifference 
{
    public static void main(String[] args) 
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total rows and columns: ");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        System.out.print("Enter matrix: ");
        int sum=0,sum1=0;
        for(i = 0; i < n; i++)  
        {  
        for(j = 0; j < n; j++)   
            {  
            arr[i][j] = sc.nextInt();  
            System.out.print(" ");  
            }  
        }  
        for(i=0; i<n; i++)
        { 
            for(j=0; j<n;j ++)
            { 
                //arr[i][j] = sc.nextInt();
                if(i==j) 
                {
                    sum = sum + arr[i][j];
                }
                if(i+j== n-1)
                {
                    sum1 = sum1 + arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(sum-sum1)) ;
    }
}