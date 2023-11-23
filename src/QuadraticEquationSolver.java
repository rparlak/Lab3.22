import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero. Quadratic equation is not valid.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;


        switch ((int) Math.signum(delta)) {
            case 1:

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
            case 0:

                double x = -b / (2 * a);
                System.out.printf("Root: x = %.2f\n", x);
                break;
            case -1:

                System.out.println("No real roots exist for the given quadratic equation.");
                break;
        }

        scanner.close();
    }
}
