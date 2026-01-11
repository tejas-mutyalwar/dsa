/**
 * Count digits in a number
 */
import java.util.Scanner;

public class MyArray {

    private static Integer countDigit(Integer number) {
        Integer count = 0;
        if (number>=0 && number<10) {
            return 1;
        } else{
            while(number/10 != 0) {
                number = number/10;
                count++;
            }
            return ++count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        Integer number = scanner.nextInt();

        System.out.println("#digits: " + countDigit(number));
        scanner.close();
    }
}