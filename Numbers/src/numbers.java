import java.util.Scanner;

public class numbers {


    public static void main(String[] args)
    {

        byte days = 1;
        byte hours = 24;
        byte minutes = 60;
        byte seconds = 60;
        int resultSeconds;
        int resultDays;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of Days: ");
        days = scan.nextByte();

        System.out.println("Enter a number for hours: ");
        hours = scan.nextByte();

        System.out.println("Enter a number for minutes: ");
        minutes = scan.nextByte();

        System.out.println("Enter a number for seconds: ");
        seconds = scan.nextByte();

        resultSeconds = seconds + minutes * 60 + hours * 3600;

        System.out.println("The input of hours, minutes and seconds results to " + resultSeconds + " seconds.");

        System.out.println();

        resultDays = seconds + minutes *60 + hours *3600 + days * 86400;

        System.out.println("The input of Days into seconds results to " +resultDays + " seconds.");

    }
}
