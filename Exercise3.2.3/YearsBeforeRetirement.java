public class YearsBeforeRetirement
{
  public static void main(String[] args)
  {
    int myAgeNow;
    int myAgeWhenIRetire;
    int yearsLeftWorking;
    myAgeNow = 19;
    myAgeWhenIRetire = myAgeNow + 49;
    yearsLeftWorking = myAgeWhenIRetire - myAgeNow;
    System.out.println("My age now is " + myAgeNow);
    System.out.println("My age when i retire is " + myAgeWhenIRetire);
    System.out.println("Years left Working " + yearsLeftWorking);
  }
}
