package Task18;

import java.util.Scanner;

public class ThrowsDemo3 {

    public static void main(String[] args) {
        ThrowsDemo3 demo = new ThrowsDemo3();

        demo.getKey();
    }

    public void getKey() { 
        Scanner myScanner = new Scanner(System.in); 
        String key = myScanner.next();

        while(!printDetails( key )){
            System.out.println("Try Again");
        }

        myScanner.close();
    } 
    public Boolean printDetails(String key) { 
        try { 
            String message = getDetails(key); 
            System.out.println( message ); 
        }
        catch ( Exception e){ 
            System.out.println("Error in print details");
            return false; 
        } 

        return true;
    } 

    private String getDetails(String key) { 
        if(key == "") {
            throw new NullPointerException( "Key set to empty string" ); 
        } 
        return "data for " + key; 
    } 
}
