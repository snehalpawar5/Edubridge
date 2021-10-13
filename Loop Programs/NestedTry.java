public class NestedTry
{
public static void main(String []args)
{
try{
      System.out.println("Java Code");
      try{
        System.out.println("It's a nested try block.");
        int a = 5 / 0;
      }catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException caught");
      }
    }catch (ArithmeticException e) {
      System.out.println("ArithmeticException caught");
    }finally {
      System.out.println("Run your java code.");
    }
  }
}