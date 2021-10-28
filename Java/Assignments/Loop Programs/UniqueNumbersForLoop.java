import java.util.Scanner;

public class UniqueNumbersForLoop 
{
public static void main(String[] args) 
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter an array size: ");
  int n = sc.nextInt();
  int arr[] = new int[100];
  //int x = arr.length;
  int[] arr1 = new int[n];
  int p = 0;
  for(int i = 0; i < n; i++)
  {
        arr[i] = sc.nextInt();
        int temp = arr[i];
        int count = 0;
        for(int y = 0; y < n; y++)
        {
            if(arr1[y] != temp)
            {
               count++;
            }
        }
        if(count == n)
        {
            arr1[p] = temp;
            p++;
        }
    }
System.out.println(p);
    for(int a = 0; a < p; a++)
    {
     for(int k = a+1; k < p; k++)
     {
      if(arr1[a]<arr1[k])
       {
        System.out.print(arr1[a]);
        }
     }
        if(a < p-1)
        {
            System.out.print(" ");
        }
    }
 }

}