import java.util.Scanner;

import Interface.Menu;
import Model.Account;
import Model.Loan;

public class Main
{    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Account account=new Account();
        Loan loan=new Loan();
        System.out.print("Enter your Name to create an account: ");
        account.name=scan.next();
        System.out.print("Enter initial balance: ");
        int balance=scan.nextInt();
        account.setBalance(balance);
        Menu.showMenu();
        int choice=scan.nextInt();
        while(choice!=7)
        {
            switch(choice)
            {
                case 1:
                    account.viewBalance();
                    break;
                case 2:
                    System.out.print("\nEnter amount to deposit: ");
                    int depo=scan.nextInt();
                    account.deposit(depo);
                    System.out.println("Deposited Successfully!");
                    break;
                case 3:
                    System.out.print("\nEnter amount to withdraw: ");
                    int withd=scan.nextInt();
                    if(account.withdraw(withd)) System.out.println("Withdrawn Successfully!");
                    else System.out.println("\nInsufficient balance to withdraw!!");
                    break;
                case 4:
                    System.out.print("Enter amount for loan: ");
                    int lamount=scan.nextInt();
                    loan.takeLoan(lamount,account);
                    break;
                case 5:
                    loan.getLoanStatus();
                    System.out.print("Enter the amount of loan to pay:");
                    int pamount=scan.nextInt();
                    loan.payLoan(pamount, account);
                    break;
                case 6:
                    loan.getLoanStatus();
                    break;
                default:
                    System.out.println("\nEnter valid option!");
            }
            Menu.showMenu();
            choice=scan.nextInt();
        }
        scan.close();
        System.out.println("\nThanks for using Bank account manager!!");
    }
}