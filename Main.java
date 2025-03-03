import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> theArrayList = new ArrayList<String>();

    String word = "";
    while (!word.equals("STOP"))
    {
      System.out.println("You are in the loop, please enter a word! ");
      word = sc.nextLine();
      theArrayList.add(word);
    }
    theArrayList.remove(theArrayList.size()-1);
    //System.out.println(countSecondInitial(theArrayList, "i"));
    System.out.println(searchSecond(theArrayList));
  }

  /** Returns the number of Strings in the ArrayList that has the letter
   * as the second letter in that word.
   * Precondition: The arr is not null, and is not empty.
   * Precondition: The letter is exactly one letter.
   */
  public static int countSecondInitial(ArrayList<String> theArrayListString, String target)
  {
    int theCounter = 0;
    for (int i = 0; i < theArrayListString.size(); i++)
    {
      if ((theArrayListString.get(i).indexOf(target) == 1)) 
      {
        theCounter++;
      }
    }
    System.out.print("Search for i: ");
    return theCounter;
  }

  /** Returns the index of the second occurrence of target within the ArrayList
   * If the target is not found, or is only found once, then -1 is returned.
   * Precondition: Neither arr nor target are null.  The arr is non-empty.
   */
  public static int searchSecond(final ArrayList<String> theArrayList)
  {
    Scanner sc = new Scanner(System.in);
    String target; 
    System.out.println("Enter String to search for. ");
    target = sc.nextLine();
    int theIndex = -1;
    int theCount = 0;
    for (int i = 0; i < theArrayList.size(); i++)
    {
      if (theArrayList.get(i).equals(target))
      {
        theCount++; 
      }
      if (theCount == 2)
      {
        theIndex = i;
      }
    }
    System.out.print("searchSecond returns: ");
    return theIndex; 
  }
}
