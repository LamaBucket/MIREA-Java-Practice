package Task18;

public class ThrowsDemo2 {

    public static void main(String[] args) {
        try {
            ThrowsDemo2 demo = new ThrowsDemo2();

            demo.printMessage(null);
            demo.printMessage("Hello");

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void printMessage(String key) { 
        String message = getDetails(key); 
        
        System.out.println(message); 
    }
    public String getDetails(String key) {
        if(key == null) { 
            throw new NullPointerException("The key was null"); 
        } 
        
        return "data for" + key; 
    }
}
