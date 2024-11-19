package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // SUBTASK 1
        Task1("Hello, My Name is Java!!!");

        // SUBTASK 2
        Person p = new Person("Bannyy");
        p.set_name("Gleb");

        System.out.println(p.toString());
        
        //SUBTASK 3
        Address address = null;
        System.out.println("Enter Address. (7 Params Total)");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("But first: Enter the delimeter");
        String delimeter = sc.nextLine();
        
        while(address == null){
            address = Address.FromString(sc.nextLine(), delimeter);
        }

        System.out.println(address.toString());

        sc.close();


        //SUBTASK 4
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; 
        shirts[1] = "S002,Black Polo Shirt,Black,L"; 
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; 
        shirts[3] = "S004,Blue Polo Shirt,Blue,M"; 
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; 
        shirts[5] = "S006,Black T-Shirt,Black,XL"; 
        shirts[6] = "S007,White T-Shirt,White,XL"; 
        shirts[7] = "S008,White T-Shirt,White,L"; 
        shirts[8] = "S009,Green T-Shirt,Green,S"; 
        shirts[9] = "S010,Orange T-Shirt,Orange,S"; 
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtsAsShirts = new Shirt[11];

        for(int i = 0; i < 11; i++){
            shirtsAsShirts[i] = Shirt.FromString(shirts[i]);
            System.out.println(shirtsAsShirts[i].toString());
        }

    }

    private static void Task1(String str){
        if(str.length() == 0){
            System.out.println("String is empty.");
            return;
        }
        
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));

        str = "I like Java!!!";

        int index = str.indexOf("Java");
        System.out.println(index);
        
        str = str.replace("a", "o");
        
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);
        
        str = str.toLowerCase();
        System.out.println(str);
        
        System.out.println(str.substring(index, index + 4));
    }
}
