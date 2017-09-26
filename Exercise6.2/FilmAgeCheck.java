public class FilmAgeCheck
{
  public static void main(String[] args)
  {
    // The minumum age required to watch the Film
    int minimumAge = Integer.parseInt(args[0]);

    // The number of underage people
    int underAgeCountSoFar = 0;

    // We loop through the queue, checking each age
    for (int queuePosition = 1; queuePosition < args.length; queuePosition++)
    {
      int ageOfPersonAtQueuePosition = Integer.parseInt(args[queuePosition]);
      if (ageOfPersonAtQueuePosition < minimumAge)
       {
        System.out.println("The person at position " + queuePosition
                           + " is only" + ageOfPersonAtQueuePosition
                           + ", which is less than " + minimumAge);
        underAgeCountSoFar++;
       }//if
    }//for

    // Now report how many underage were found
    if (underAgeCountSoFar == 1)
      System.out.println("The is 1 under age");
    else
      System.out.println("There are " + underAgeCountSoFar + " under age");
  }// main
}// class FilmAgeCheck
