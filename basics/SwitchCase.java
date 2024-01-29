package basics;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day(1-7): ");
        day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("invalid day");

        }
        sc.close();
    }
}
