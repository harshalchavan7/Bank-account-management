package Model;
public class Account
{
    private int balance;
    public String name;
    public void deposit(int depo)
    {
        balance+=depo;
    }
    public Boolean withdraw(int withd)
    {
        if(balance>=withd)
        {
            balance-=withd;
            return true;
        }
        return false;
    }
    public void viewBalance()
    {
        System.out.println("Your balance is: " + balance);
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
}