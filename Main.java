
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;
        do {
            System.out.println("Guess my number(1-100)");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO....CORRECT NUMBER!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE");
            } else {
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }


        } while (userNumber >= 0);
        System.out.print("My number is:");
        System.out.println(myNumber);



    }

}