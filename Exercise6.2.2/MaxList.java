public class MaxList
{
  public static void main(String[] args)
  {
    double number = Double.parseDouble(args[0]);
    double biggestSoFar = number;

    for (int argIndex = 0; argIndex < args.length; argIndex = argIndex + 1)
    {
      number = Double.parseDouble(args[argIndex]);
      if (number > biggestSoFar)
        biggestSoFar = number;
    }
    System.out.println(biggestSoFar + " is the biggest number so far");
  }
}
