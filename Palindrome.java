public class Palindrome {
  public static void main (String[] args){
    
    System.out.println(isPalindrome2("Bobm"));
  }
    public static void printArray(int[] arr){
     for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }


  //Q. Given a string, the task is check whether given string is a palindrom or not
 public static boolean isPalindrome1 (String word){

  //Convert word to characters array so as to access the item by index
  char[] wordCharArray = word.toLowerCase().toCharArray();
  // printArray(wordArray);

  int startIndex = 0;
  int endIndex = word.length() - 1;

  //Compare start element and end element similar to method use to reverse array
  while (startIndex < endIndex){
    if(wordCharArray[startIndex] != wordCharArray[endIndex]) {
      return false;
    }
    startIndex++;
    endIndex--;
  }
  return true;
 }


 public static boolean isPalindrome2 (String word){
  word = word.toLowerCase();
  int wordLength = word.length();

  for(int i = 0; i < wordLength/2; i++){
    //wordlength - i - 1 tracks the character from the end
    // i tracks the character from the start
    //wordLength/2  use the first half of the word length since we are comparing characters at both ends;
    if(word.charAt(i) != word.charAt(wordLength - i - 1)){
      return false;
    }
  }
  return true;
 }
}
