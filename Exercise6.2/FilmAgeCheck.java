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
