public class FahrenheitToCelsius
{
  public static void main (String[] args)
  {
    double fahrenheitValue = Double.parseDouble(args[0]);
    double celsiusValue = (fahrenheitValue - 32) * 5/9;
    System.out.println("Temperature " + fahrenheitValue + " Fahrenheit"
                      + " in Celsius is " + celsiusValue + ".");
  }
}
