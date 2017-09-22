public class DegreeCategory
{
  public static void main(String[] args)
  {
    double studentsGrade = Double.parseDouble(args[0]);
    if(studentsGrade >= 70)
    {
      System.out.println("Honours, First Class");
    }
    else if(70 > studentsGrade && studentsGrade  >= 60)
    {
      System.out.println("Honours, Second Class, Division one");
    }
    else if(60 > studentsGrade && studentsGrade >= 50)
    {
      System.out.println("Honours, Second Class, Division two");
    }
    else if(50 > studentsGrade && studentsGrade >= 40)
    {
      System.out.println("Honours, Third Class");
    }
    else if(40 > studentsGrade && studentsGrade >= 32)
    {
      System.out.println("Pass / Ordinary Degree");
    }
    else if(studentsGrade < 32)
    {
      System.out.println("Fail");
    }
  }
}
