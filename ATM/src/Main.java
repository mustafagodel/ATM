import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       SentMoney sentmoney=new SentMoney();
        Scanner input=new Scanner(System.in);
        int balance=1000;
        String transactions="1-Balance learning\n"+
                             "2-Withdraw money\n"+
                             "3-Deposit Money\n"+
                             "4-Send Money\n"+
                             "5-Quit";
        System.out.println("---------------------------------");
        System.out.println(transactions);
        System.out.println("---------------------------------");

        while (true){

            System.out.println("Choose your action");
            String choose=input.next();
            if (choose.equals("5")){
                System.out.println("Exiting Process.......");
                break;
            }else if(choose.equals("1")){
                System.out.println("Balance:"+balance);
            }else if(choose.equals("2")){
                System.out.println("Amount You Want to Withdraw");
                int amount=input.nextInt();
                input.nextLine();
                if (balance-amount<0){
                    System.out.println("You Don't Have Enough Balance");
                }else{
                    balance-=amount;
                    System.out.println("New Balance:"+balance);
                }
            }else if(choose.equals("3")){
                System.out.println("Amount You Want to Deposit");
                int amount=input.nextInt();
                input.nextLine();
                balance+=amount;
                System.out.println("New Balance:"+balance);
            }else if(choose.equals("4")){
               sentmoney.SentMoney1(balance);
            }
        }
    }
}
