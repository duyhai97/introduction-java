import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số năm : ");
        int year = scanner.nextInt();
        boolean namnhuan = false;
        if (year % 4 == 0) {

            if ( year % 100 == 0) {

                if ( year % 400 == 0)
                    namnhuan = true;
            }
            else {
                namnhuan = true;
            }

        }
        if(namnhuan){
            System.out.println(year + "la 1 nam nhuan");
        }
        else{
            System.out.println(year + "không phải 1 nam nhuan");
        }

    }

}
