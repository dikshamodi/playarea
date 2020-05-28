import java.util.concurrent.*;

/**
 *
 */
public class first {
  public static int fact(int n) {
    int ans = 1;
    for (int i = 1; i <= n; i++) {
      ans *= i;
    }
    return ans;
  }

  public static void main(String[] args) {
  try {
    System.out.println("Hello World");
    CompletableFuture<Integer> futureTask = CompletableFuture.supplyAsync(() -> fact(5));
    System.out.println(futureTask);
    while (!futureTask.isDone()) {
      System.out.println("Not done yet");
    }
    long result = futureTask.get();
    System.out.println("The value is " + result + "\n");
  } catch(Exception e) {
    System.out.println("Exception occured\n");
  }
}
}
