import java.util.Scanner ;// import for scanning user input

public class Calculator{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Simple java calculator");
    System.out.println("Enter first number");
    double num1 = scanner.nextDouble();

    System.out.println("Enter an operator (+, -, *, /)");
    char operator = scanner.next().charAt(0);

    System.out.println("Enter Second number");
    double num2 = scanner.nextDouble();

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2; 
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
            result = num1 / num2;
            } else {
                 System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program
                }
            
        break;
      default:
        System.out.println("Sorry invalid operator");
        return;
      
    }
    System.out.println("Result is : " + result);
    scanner.close();
  }
}