package se.lexicon;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class apps {

    public static void main(String[] args) {


        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.agE = "12";
        erik.hobby = "play football";
        System.out.println(erik.getPersoInformation());
        System.out.println(erik.getFullName());


        Person test = new Person();
        test.firstName = "Tobby";
        test.lastName = "Kon";
        System.out.println(test.getPersoInformation());
        System.out.println(test.getFullName());


        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            TestCalculator.displayMenu();
            System.out.println("Enter Operation Type (+ , -)");
            char OperationType = scanner.next().charAt(0);

            System.out.println("Enter Number 1: ");
            double n1 = scanner.nextInt();
            System.out.println("Enter Number 2: ");
            double n2 = scanner.nextInt();

            switch (OperationType) {
                case '+':

                    double result = TestCalculator.addition(n1, n2);
                    System.out.println(result);
                    break;

                case '-':


                    System.out.println(TestCalculator.subtraction(n1, n2));
                    break;

                default:
                    System.out.println("Operation type is not valid");
            }
        }
    }
}








