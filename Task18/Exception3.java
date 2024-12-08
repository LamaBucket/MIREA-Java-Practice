package Task18;

public class Exception3 {
    public void exceptionDemo(){
        var exThrower = new Exception2();

        try {
            exThrower.exceptionDemo();
        } catch (Exception e) {
            System.out.println("I got this! The message is: " + e.getLocalizedMessage());
        }
        finally {
            System.out.println("I am finally running this code!");
        }
    }
}
