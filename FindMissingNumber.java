//Given an array of n - 1 distinct numbers in the range of 1 to n. Find the missing number in it.

//Mathematical Approach
//The sum of the first natural numbers = 1 + 2 + 3 + 4 .... + n =  n * (n + 1)/2;
//Get sum of the entire array and subtract each item, the remainder is the missing number

public class FindMissingNumber {
  public static void main (String[] args){
       int[] sampleArray = {1,2,4,5};
   printArray(sampleArray);
   
    int missingN = findMissingNumber(sampleArray);
    System.out.println(missingN);

  }
    public static void printArray(int[] arr){
     for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int findMissingNumber (int[] arr){

    int n = arr.length + 1;
    int sumOfElementsInArray =  n * (n + 1) / 2;

    System.out.println("Total number in range "+ sumOfElementsInArray);
    for (int i = 0; i < arr.length; i++ ){
      sumOfElementsInArray = sumOfElementsInArray - arr[i];
    }
    return sumOfElementsInArray;
  }
}