import java.util.*;
public class ArraySortingASC
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int arr[] = new int[5];
System.out.println("Enter the elements in array: ");
for(int i=0; i<5; i++)
{
arr[i] = sc.nextInt();
}
System.out.println("array before sorting: ");
for(int i=0; i<5; i++)
{
System.out.print(arr[i]+ " ");
}
System.out.println();
for(int i=0; i<5; i++)
{
for(int j=i+1; j<5; j++)
{
if(arr[i]>arr[j])
{
int temp = 0;
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}}
System.out.println("Array after sorting: ");
for(int i=0; i<5; i++)
{
System.out.print(arr[i]+ " ");
}
}}
