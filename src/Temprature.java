import java.util.Scanner;

public class Temprature {

    public static void main(String[] args) {

        System.out.println("--------------------welcome-------------");
        System.out.println("------Celsius-Fahrenheit/Fahrenheit-Celsius converter------");
        System.out.println("Choose the conversion mode: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit (1) Fahrenheit to Celsius (2)");
        // System.out.println("Celsius to Fahrenheit (1) Fahrenheit to Clesius(2)");

        int result = scan.nextInt();

        if (result == 1) {

            System.out.println("Celsius-Fahrenheit");
            System.out.println("Enter Celsius value: ");
            double value = scan.nextDouble();
            double finalResult = ((value * 9) / 5) * 32;
            System.out.println("Fahrenheit is = " + finalResult);

        } else if (result == 2) {

            System.out.println("Fahrenheit to Celsius");
            System.out.println("Enter Fahrenheit value");
            double value2 = scan.nextDouble();
            double valueFinal = (value2 - 32) * 5 / 9;
            System.out.println("Celsius is: " + valueFinal);

        } else {
            System.out.println("Not a valid choice!");
            System.out.println("Do you want to convert other temperature?: Y/N");
            String str = scan.next();

            if (str.equals("Y")) {
                System.out.println("do again");

            } else if (str.equals("N")) {
                System.out.println("----------------------Good bye,.......see you soon");
            } else {
                System.out.println("Not Valid");
            }


        }
    }
}

