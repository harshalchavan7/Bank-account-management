package Model;
public class Loan {
    public int lamount;
    public void takeLoan(int loan,Account account)
    {
        lamount+=loan;
        account.deposit(loan);
    }
    public void payLoan(int amount,Account account)
    {
        if(lamount>0 && lamount-amount>0)
        {
            if(account.withdraw(amount)) lamount-=amount;
            else System.out.println("\nInsufficient balance to pay loan!");
        }
        else if(lamount<0) System.out.println("You have no loan");
        else
        {
            account.deposit(amount-lamount);
            lamount=0;
            System.out.println("Loan paid successfully with additional amount deposited to account");
        }
    }
    public void getLoanStatus()
    {
        if(lamount==0) System.out.println("You have no loan!");
        else System.out.println("Your loaned amount: "+lamount);
    }
}