public class Recursion {

  public static void main(String[] args) {
    System.out.println("\n" + iterativeFactorial(3));
    System.out.println("\n" + recursiveFactorial(4) + "\n");
  }

  // 1! = 0!
  // 2! = 2 * 1!
  // 3! = 3 * 2!
  // n! = n * (n - 1)!
  // we can use this formula to write a recursive method like the one just below:

  public static int recursiveFactorial(int num) {
    if (num == 0) {
      return 1;
    }
    return num * recursiveFactorial(num - 1);
  }

  public static int iterativeFactorial(int num) {
    if (num == 0) {
      return 1;
    }
    int factorial = 1;
    for (int i = 1; i <= num ; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
