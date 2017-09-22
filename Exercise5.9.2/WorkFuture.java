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

    //State the year you were born in
    System.out.println("you were born in " + birthYear);

    //The year user will retire
    System.out.println("you will retire in " + retirementYear);

  }
}
