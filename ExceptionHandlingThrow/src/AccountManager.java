public class AccountManager {

    public void deposit(Account account, double amount)
    {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited. \n New Balance: " + account.getBalance());
    }

    public void withdraw(Account account, double amount) throws InsufficientBalanceException {
        if ((account.getBalance() - amount) > 0)
        {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawed \n New Balance: " + account.getBalance());
        }
        else
        {
            throw new InsufficientBalanceException("Invalid amount!");
        }
    }

    public void getAccountInfo(Account account)
    {
        System.out.println(account.getId()+ "\n" + account.getName() + "\n" + account.getSurname() + "\n" + account.getBalance());
    }
}