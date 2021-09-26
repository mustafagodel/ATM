import java.util.Scanner;

public class SentMoney {

    public void SentMoney1(int balance) {
        Scanner input = new Scanner(System.in);
        System.out.println("Amount of money to be sent");
        int money = input.nextInt();
        if (balance - money < 0) {
            System.out.println("You Don't Have Enough Balance");
        } else {
            input.nextLine();
            System.out.println("Iban");
            String Iban = input.nextLine();
            if (Iban.length() <= 26) {
                System.out.println("Process Completed");
            } else {
                System.out.println("Wrong Account");
            }
        }

    }

}