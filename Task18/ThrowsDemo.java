package Task18;

public class ThrowsDemo {

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        try {
            demo.getDetails(null);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    public void getDetails(String key) { 
        if(key == null) {
            throw new NullPointerException("The key was null"); 
        } 
        System.out.println("Key is: " + key);
    } 
}
