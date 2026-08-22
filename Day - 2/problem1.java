
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }
    }
}



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }
}



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter choice ");
        int c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.print("Addition : " + (num1 + num2));
                break;

            case 2:
                System.out.print("Sub : " + (num1 - num2));
                break;

            case 3:
                System.out.print("Mul : " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Not divide by 0");
                }
                System.out.print("Division : " + (num1 / num2));
                break;

        }

    }
}



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2 : ");
        int num2 = sc.nextInt();

        if (num1 > 40 && num2 > 40) {
            System.out.println("Pass");
        } else {
            System.out.print("Fail");
        }

    }
}

//Age Category


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1 = sc.nextInt();

        if (num1 > 0 && num1 <= 12) {
            System.out.println("Child");
        } else if (num1 > 12 && num1 < 20) {
            System.out.print("Teenage");
        } else if (num1 > 19 && num1 < 60) {
            System.out.print("Adult");
        } else {
            System.out.print("Senior");
        }

    }
}
