import java.util.Scanner;
//great job khalid, thanks for your hard work
//your grade is 4.5/5
//@ change the class name Main to match the file name Assignment1 ( golden rule )
class Assignment1 {
  public static void main(String[] args) {     
    Scanner twonumbers = new Scanner(System.in);
    System.out.println("Enter two float digits :"); 
    float num1 = twonumbers.nextFloat();
    float num2 = twonumbers.nextFloat();
    System.out.println("Addition + : "+(num1+num2));
    System.out.println("Subtraction  - : "+(num1-num2)); 
    System.out.println("Multiplication  * : "+(num1*num2));
    System.out.println("Division / : "+(num1/num2)); 
    System.out.println("Modulus % : "+(num1%num2));
    System.out.println("Grater > : "+(num1>num2)); 
    System.out.println("Grater or equal >= : "+(num1>=num2));
    System.out.println("Less < : "+(num1<num2)); 
    System.out.println("Less or equal <= : "+(num1<=num2)); 
    System.out.println("Not equal != : "+(num1!=num2)); 
    System.out.println("Equal == : "+(num1==num2)); 
    //Khaled Abdulaziz
    //442012310
  }
}
