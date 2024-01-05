//TASK-3
import java.util.*;
public class ATMInterface{
    public static Scanner sc=new Scanner(System.in);
    public static double accountBalance=1000;
    public static void atminterface(){
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("please select an option:");
        int n=sc.nextInt();
        switch(n){
            case 1:Withdraw();
                   break;
            case 2:Deposit();
                   break;
            case 3:CheckBalance();
                   break;
            case 4:System.out.println("Thank you for using the ATM!");
                   System.out.println();
                   System.exit(0);
                   break;
            default:System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    atminterface();
        }
    }
    public static void Withdraw(){
        System.out.print("Enter the amount to withdraw: $");
        double amount = sc.nextDouble();
        if (amount > accountBalance) {
            System.out.println("Insufficient funds.");
            System.out.println();
        } else {
            accountBalance=accountBalance-amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
            System.out.println();
        }
        atminterface();
    }
    public static void Deposit(){
        System.out.print("Enter the amount to deposit: $");
        double amount = sc.nextDouble();
        if(amount <= 0){
            System.out.println("Invalid amount.");
            System.out.println();
        }else{
            accountBalance=accountBalance+amount;
            System.out.println("Deposit successful. Current balance: $" +accountBalance);
            System.out.println();
        }
        atminterface();
    }
    public static void CheckBalance(){
        System.out.println("Your current balance is: $" + accountBalance);
        System.out.println();
        atminterface();
    }
    public static void main(String args[]){
        System.out.println("Wellcome to ATM!");
        atminterface();
    }
}

/*Wellcome to ATM!
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
please select an option:3
Your current balance is: $1000.0

1. Withdraw
2. Deposit
3. Check Balance
4. Exit
please select an option:1
Enter the amount to withdraw: $543
Withdrawal successful. Remaining balance: $457.0

1. Withdraw
2. Deposit
3. Check Balance
4. Exit
please select an option:2
Enter the amount to deposit: $675
Deposit successful. Current balance: $1132.0

1. Withdraw
2. Deposit
3. Check Balance
4. Exit
please select an option:4
Thank you for using the ATM! */
