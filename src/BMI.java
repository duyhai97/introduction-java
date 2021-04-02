import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao(kg): ");
        double height = scanner.nextDouble();

        System.out.println("Nhập cân nặng(m): ");
        double weight = scanner.nextDouble();

        double BMI = weight/(height*height);

        if(BMI<18.5)
            System.out.println("Underweight");
            else if (BMI<25)
                System.out.println("Normal");
                else if (BMI<30)
                     System.out.println("'Overweight'");
                    else
                         System.out.println("'Obese'");


    }
}
