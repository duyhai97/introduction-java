import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("nhập b: ");
        double b = scanner.nextDouble();

        double x = -b/a;
        if(a== 0 && b==0 ){
            System.out.println("Pt vô số nghiệm");
        }
        else if (a==0 && b != 0 ){
            System.out.println("Pt vô nghiệm");
        }
             else {
            System.out.println("Pt có nghiệm x = " + x);
        }


    }
}
