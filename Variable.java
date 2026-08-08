import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius *9/5)+32;
        int intPart = (int) fahrenheit;
        int roundedPart = (int) Math.round(fahrenheit);

        System.out.println("Fahrenheit (double) = " + fahrenheit);
        System.out.println("Integer part = " + intPart);
        System.out.println("Rounded integer = " + roundedPart);

        sc.close();

            System.out.println("hi");
             
    }

}