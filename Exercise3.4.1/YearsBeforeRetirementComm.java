public class YearsBeforeRetirementComm
{
  public static void main(String[] args)
  {
    int myAgeNow;
    int myAgeWhenIRetire;
    int yearsLeftWorking;
    myAgeNow = Integer.parseInt(args[0]);
    myAgeWhenIRetire = 68;
    yearsLeftWorking = myAgeWhenIRetire - myAgeNow;
    System.out.println("My age now is " + myAgeNow);
    System.out.println("My age when i retire is " + myAgeWhenIRetire);
    System.out.println("Years left Working " + yearsLeftWorking);
  }
}
