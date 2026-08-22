import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number1 : ");
      int num1 = sc.nextInt();
       
      if(num1 > 0 && num1 <= 12){
        System.out.println("Child");
      }
      else if(num1 > 12 && num1 < 20){
        System.out.print("Teenage");
      }
      else if (num1 > 19 && num1 < 60){
        System.out.print("Adult");
      }
      else{
        System.out.print("Senior");
      }
    
    }
}