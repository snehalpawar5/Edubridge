public class ExceptionHandle {
public static void main(String args[]) {
//int[] arr ={1,2,3,4,5,6,7,8};
try
{
int[] arr ={1,2,3,4,5,6,7,8};
System.out.println(arr[15]);
}
catch(Exception e)
{
System.out.println(e);
}
}
}