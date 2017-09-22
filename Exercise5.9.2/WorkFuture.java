public class WorkFuture
{
  public static void main(String[] args)
  {
    //The present year
    int presentYear = Integer.parseInt(args[0]);

    //users birth year
    int birthYear = Integer.parseInt(args[1]);

    //year they will retire
    int retirementYear = birthYear + 68;

    //years left Working
    int yearsToWork = retirementYear - presentYear;

    //State the year you were born in
    System.out.println("you were born in " + birthYear);

    //state years left Working
    System.out.println("you have " + yearsToWork + " years left to work");

    //year after birth
    int someYear = retirementYear;
    yearsToWork = someYear - retirementYear;

    //while
    while (someYear != presentYear)
    {
      if (yearsToWork == 0)
        System.out.println("you will retire in " + someYear);
      else
      {
        //print out years left Working
        System.out.println("in " + someYear + " you will have " + yearsToWork + " years left working");
      }
      someYear = someYear - 1;
      yearsToWork = retirementYear - someYear;

    }//while
  }
}
