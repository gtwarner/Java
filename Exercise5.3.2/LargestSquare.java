public class LargestSquare
{
  public static void main(String[] args)
  {
    int requiredInteger = Integer.parseInt(args[0]);
    int currentValue = requiredInteger;
    int currentValueSquared = currentValue * currentValue;

    while (currentValueSquared >= requiredInteger)
    {
      currentValue = currentValue - 1;
      currentValueSquared = currentValue * currentValue;
    }
    System.out.println("largest square number is = " + currentValueSquared);
  }
}
