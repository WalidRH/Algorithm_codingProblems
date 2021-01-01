import java.util.*;

class Main {
  public static void main(String[] args) {
    int n = 100;
    List<Integer> primeNumber = new ArrayList<>();
    for (int element = 0; element < n; element++){
      if (element%2 != 0 && element%3 != 0){
        primeNumber.add(element);
      }
    }
    System.out.println("Prime Numbers");
    primeNumber.forEach(
      (element) -> {
        System.out.println(element);
      }
    );
  }
}
