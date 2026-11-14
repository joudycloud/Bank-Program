import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){
        double balance=0;
        boolean isRunning=true;
        int choice;
        while(isRunning){
            System.out.println("**************");
            System.out.println(" BANK PROGRAM ");
            System.out.println("**************");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += Deposit();
                case 3 -> balance -= withDraw();
                case 4 -> isRunning=false;
                default -> System.out.println(" INVAILD CHOICE ");
            }
        }
        System.out.println("*************");
        System.out.println("THANK U 😊 HAVE A WONDERFUL DAY ! ");
        System.out.println("*************");
    }
    static void showBalance(double balance){
        System.out.printf("%.2f SAR", balance);
        System.out.println("");
    }
    static double Deposit(){
        System.out.print("Enter an amount to Depositing : ");
        double amount = scanner.nextDouble();
        if (amount <0){
            System.out.println("Amount can't be negtive 🤦");
            return 0;
        }else {
            return amount;
        }
    }
    static double withDraw() {
        System.out.print("Enter an amount to withdrawing : ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negtive 🤦");
            return 0;
        } else {
            return amount;
        }
    }
}
