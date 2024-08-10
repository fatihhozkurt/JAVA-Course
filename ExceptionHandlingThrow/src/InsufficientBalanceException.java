public class InsufficientBalanceException extends Exception{

    String exceptionMessage;

    public InsufficientBalanceException(String exceptionMessage)
    {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage()
    {
        return exceptionMessage;
    }
}
