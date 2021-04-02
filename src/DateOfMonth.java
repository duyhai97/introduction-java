import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn tìm tháng mấy ? : ");
        int month = scanner.nextInt();

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10  :
            case 12  :
                System.out.println("tháng " + month + "có 31 ngày");
                break;
            case 2 :
                System.out.println("tháng 2 có 28 ngày");
                break;
            default :
                System.out.println("tháng " + month + " có 30 ngày");
        }

    }
}
