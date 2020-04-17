import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter an integer representing the number of integers to be entered: ");
    int n = in.nextInt();

    List<Integer> intList = new ArrayList<>();
    List<Integer> counter = new ArrayList<>();

    for(int i=0;i<n;i++) {
      System.out.print(String.format("Enter integer %d: ", i+1));
      int input = in.nextInt();
      
      if (!intList.contains(input)) {
        //add new numbers to distinc intList and init counter at the same time
        intList.add(input);
        counter.add(1);
      } else {
        // if already existing, increment counter for corresponding int
        int counterIndex = intList.indexOf(input);
        counter.set(counterIndex, counter.get(counterIndex)+1);
      }
    }

    // from here on, just get highest counter and print associated distinct int from intList
    
    int max = counter.get(0);
    int index = 0;

    for(int i=1;i<counter.size();i++) {
      if (counter.get(i) > max) {
        max = counter.get(i);
        index = i;
      }
    }

    System.out.println(intList.get(index));
    
  }
}
