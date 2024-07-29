public class AccountManager {

    public void deposit(Account account, float amount)
    {
        account.set_balance((account.get_balance() + amount));

        System.out.println(amount + " TL hesaba yatırıldı." + "\n" + "Yeni hesap bakiyesi: " + account.get_balance());
    }

    public void withdraw(Account account, float amount) throws InsufficientBalanceException {
        if (account.get_balance()>=amount)
        {
            account.set_balance(account.get_balance() - amount);
            System.out.println("Para çekme işlemi başarılı." + "\n" + "Yeni hesap bakiyesi: " + account.get_balance());
        }
        else
        {
            throw new InsufficientBalanceException("Bakiye yetersiz!");
        }
    }

    public void getBalance(Account account)
    {
        System.out.println("Hesap bakiyesi: " + account.get_balance());
    }
}
