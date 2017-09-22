public class MinimumTankSize
{
 public static void main(String[] args)
 {
  double requiredVolume = Double.parseDouble(args[0]);
  double sideLength = 0.5;
  while (sideLength * sideLength * sideLength < requiredVolume)
  {
    sideLength = sideLength + 0.5;
    System.out.println("Side Length = " + sideLength);
  }
  System.out.println("you need a tank of " + sideLength
                      + " metres per side to hold the volume "
                      + requiredVolume + " cubic metres");
  }
}
