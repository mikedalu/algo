public class MyArrayUtil {

  public static void main (String[] args){
    System.out.println("Hello world");

    int[] myArray = {6,10,9,34,0,33,5,0,0, 77, 21,15};
    int[] oddNumbers = getOddNumFromArray(myArray);
    printArray(oddNumbers);


    printArray(myArray);
    // int [] reversedItems = reverseArray(myArray);
    // printArray(reversedItems);
    // System.out.println(findMinValueInArray(myArray)); // finds minimum value in an array
  //  int secondMax = secondMaximunValueArray(myArray);
  //  System.out.println(secondMax);
   moveZerosToEnd(myArray);
  }

  public static void printArray (int[] arr){

    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");

    }
    System.out.println("");
  }

  public static int[] getOddNumFromArray (int[] arr){
    //count number of odd numbers
    int oddNumberCount = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 != 0){
        //number is odd
        oddNumberCount++;
      }
    }


    int[] result = new int[oddNumberCount];
    int startIndex = 0;
    //populate the result array with odd numbers;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] % 2 != 0){
        result[startIndex] = arr[i];
        startIndex++;
      }
    }
    return result;
  }


  public static int[] reverseArray (int[] arr){
    int startIndex = 0;
    int endIndex = arr.length -1;

    while (startIndex < endIndex){

      //swap elements
      int temporaryElement = arr[startIndex];
      arr[startIndex] = arr[endIndex];
      arr[endIndex] = temporaryElement;

      startIndex++;
      endIndex--;
    }
    return arr;
  }
  public static int findMinValueInArray (int[] arr){
    if(arr.length == 0 || arr == null){
      throw new IllegalArgumentException("Invalid Input");
    }
    int min = arr[0]; // min will hold the minimum of the array;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] < min){
        min = arr[i];
      }
    }
  return min;
  }

   //Q. Given an array of integers, return second maximum value. The second maximum value  exists.
   //Example. input:  arr = {12, 34, 2, 33, 1};  Output : 33

   public static int secondMaximunValueArray (int[] arr){
  
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    

    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max){
        secondMax = max; //store the value of max in 2nd max before setting the new value of the n  ew max
        max = arr[i];
    } else if (arr[i] > secondMax && arr[i] != max){
      secondMax = arr[i];
    }

    
   }
   return secondMax;
  }

// Q. Given an array of integers, write a function to move all 0's to end of it while maintaining the relative order of the non-zero elements.

public static void moveZerosToEnd (int[] arr){


  int[] result = new int[arr.length];
  int indexOfNonZeroItems = 0;
  int zeroCount = 0;
  for( int i = 0; i < arr.length; i++){

    if(arr[i]  == 0){
      zeroCount++;
    } else{
      result[indexOfNonZeroItems] = arr[i];
      indexOfNonZeroItems++;

    }
  }
  System.out.println("array without zeros");

  printArray(result);
  
  for (int i =arr.length - zeroCount; i < arr.length; i++){
    System.out.print(i + " index to insert");
    arr[i] = i;
  }
  System.out.println( " result with zeros moved===============");
  printArray(result);
  System.out.println("array without zeros=====================");
}
  

//Q Given an array of integers, return an array ith even integers removed.
//Input: arr= {3,2,4,7,10,6,5}\
//Output arr={3,7,5}

}
