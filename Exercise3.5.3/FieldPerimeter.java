public class FieldPerimeter
{
 public static void main(String[] args)
 {
   int length = Integer.parseInt(args[0]);
   int width = Integer.parseInt(args[1]);
   int lengthoffence = length * 2 + width * 2;
   System.out.println("The length of the fence with the field size of " +
                    "(" + length + "," + width + ") "
                     + "is " + lengthoffence);
   }
 }
