import java.util.Scanner;

public class SecondDegreeEquationSolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println(" This equation is not a socond-degree equation.");
        } else {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("The equation has no real roots.");
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("The equation has two real roots: x1 = " + x1 + ", x2 = " + x2);
            }
        }
        input.close();
    }
}

