import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = input.nextDouble();
//        double x = 7.1;
        double a = 1.53, b = 5.14, c = 3.97;

        double y = (a * x + 3.8 * Math.tan(x)) / Math.sqrt(c * Math.pow(x, 3) + c * b);

        System.out.println(y);

    }
}
