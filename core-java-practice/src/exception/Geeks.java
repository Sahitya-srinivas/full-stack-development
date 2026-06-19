package exception;

class CustomException extends Exception {
    public CustomException(String number) {
        super(number);
    }
}

public class Geeks {
    public static void main(String[] args) {
        try {
            throw new CustomException("Handled Exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}