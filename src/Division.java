import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        double num1, num2, div;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        num1=scanner.nextDouble();
        System.out.println("Enter the Second Number: ");
        num2=scanner.nextDouble();

        div=num1/num2;

        System.out.println("The division is: "+div);
    }
}
