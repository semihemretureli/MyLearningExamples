public class BalanceInsufficentException extends Exception{
    public BalanceInsufficentException (String message){

    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
