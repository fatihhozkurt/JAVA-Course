public class Main {
    public static void main(String[] args) {

        //Account oluştur
        Account account = new Account(1,"Fatih", "Özkurt", "11111111111", 269.0F);

        //AccountManager oluştur
        AccountManager accountManager = new AccountManager();

        //Bakiye alma metodunu çağır
        accountManager.getBalance(account);

        //Para yatırma metodunu çağır
        accountManager.deposit(account,500.0F);

        //withdraw metounda throw new Exception("Message") ile bir hata fırlatıldığı için try-catch içerisine aldık
        try {

            accountManager.withdraw(account,1000.0F);

        } catch (InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());

        }
    }
}