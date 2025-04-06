public class lineaTC {
  public static void main(String[] args){

    lineaTC linearAlto = new lineaTC();

    int result = linearAlto.findSum2(6);
    System.out.println(result);


  }

  public int findSum(int n){
    int sum = 0; // 1 step
    for (int i = 0; i<=n; i++){
      sum = sum + i; // n steps
    }
    return sum;
  }

  public int findSum2 (int n){
    return n * (n + 1)/2;
  }


}
