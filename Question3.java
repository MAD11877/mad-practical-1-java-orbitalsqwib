import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter an integer: ");
    int i = in.nextInt();

    /**
     * Yo, due to the limitation of the auto grading system
     * you do not need to show a prompt for input/output
     * Just the calculated answers will do
     */
    System.out.println(i*i);
  }
}
