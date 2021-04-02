import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số USD: ");
        int USD = scanner.nextInt();
        int VND = USD*23000;
        System.out.println(VND + "VND");

    }

}
