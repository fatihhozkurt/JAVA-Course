public class InsufficientBalanceException extends Exception{

    String _message;

    public InsufficientBalanceException(String message)
    {
        _message = message;
    }

    @Override
    public String getMessage() {
        return _message;
    }
}
