public class Main {
  public static void main (String[] args) {
    System.out.println("Hello Java in Vs coe");
    double now = System.currentTimeMillis();


    Main demoCalc = new Main();

    int result = demoCalc.findSum_N_Numbers2(99999);
    System.out.println(result);
    System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milli seconds");
  }

  public int findSum_N_Numbers (int n) {
    int sum = 0;
    for (int i = 1; i <=n; i++) {
      sum += i;
    }
    return sum;
  }

  public int findSum_N_Numbers2 (int n){
    return n * (n +1) /2;
  }
}