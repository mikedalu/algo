public class ResizeArrayUtil {
  public static void main (String[] args){
   int[] sampleArray = {3,4,0,80,15};
   printArray(sampleArray);
   
   try{
     int[] newArray = resizeArray(sampleArray, 3);
     printArray(newArray);
    }   
    catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

      }
  public static void printArray(int[] arr){
     for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

public static int[] resizeArray(int[] arr, int capacity){
  if(capacity < arr.length){
    throw new IllegalArgumentException("Capacity must be greater than lenght of input array");
  }
  // create a new array with the new size 
  int[] newArray = new int[capacity];

  //copy the elements into new array
  for (int i = 0; i < arr.length; i++){
    newArray[i] = arr[i];
  }
 arr = newArray;
  return newArray;
}
}

