public class Variance
{
  public static void main(String[] args)
  {
    int sumSoFar = Integer.parseInt(args[0]);

    for (int argIndex = 1; argIndex < args.length; argIndex = argIndex + 1)
      sumSoFar = sumSoFar + Integer.parseInt(args[argIndex]);

    double sumOfSquareDifferencesSoFar = 0;
    double mean = sumSoFar / (double) args.length;

    System.out.println("The mean average is " + mean);

    for (int argIndex = 0; argIndex < args.length; argIndex = argIndex + 1)
    {
      int number = Integer.parseInt(args[argIndex]);
      double difference = number - mean;
      double sqauredifference = difference * difference;

      sumOfSquareDifferencesSoFar = sumOfSquareDifferencesSoFar + sqauredifference;

    }
    double variance = sumOfSquareDifferencesSoFar / args.length;

    System.out.println("Variance:\t" + variance);
  }
}
