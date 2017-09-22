public class MaxTwoDoubles
{
  public static void main(String[] args)
  {
    double num1 = Double.parseDouble(args[0]);
    double num2 = Double.parseDouble(args[1]);
    System.out.println(num1);
    System.out.println(num2);

    if (num1 > num2)
    {
      System.out.println(num1 + " is the biggest");
    }
    else if (num2 > num1)
    {
      System.out.println(num2 + " is the biggest");
    }
    else
    {
      System.out.println("both numbers are the same value");
    }
  }
}
