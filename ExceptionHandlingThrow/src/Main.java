public class Main {
    public static void main(String[] args) {


        Account account = new Account(1,"Fatih","Özkurt",2000.0);
        AccountManager accountManager = new AccountManager();

        accountManager.deposit(account,2000.0);
        accountManager.getAccountInfo(account);

        try{
            accountManager.withdraw(account,500.0);
        }
        catch (InsufficientBalanceException exception){
            try {
                throw new InsufficientBalanceException(exception.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}