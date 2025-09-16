package exception;
public class ExceptionHandling {
    static void method() {
        try {
            throw new Error("Handled Exception Executed Succesfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        method();
    }
}


