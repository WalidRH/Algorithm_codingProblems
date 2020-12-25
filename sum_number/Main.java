import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    int resultNumber = 7;
    int[] array = { 12, 9, 11, 6, 1, 4, 5 };
    System.out.println(sumTwoNumbers(array, resultNumber));
  }

  static boolean sumTwoNumbers(int[] array, int resultSum) {
    List<Integer> listNumber = new ArrayList<Integer>();
    for (int element : array) {
      if (resultSum > element) {
        if (listNumber.contains(resultSum - element)){
          return true;
        }
        listNumber.add(element);
      }
    }
    return false;
  }
}
