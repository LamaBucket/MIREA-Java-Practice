package Task19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fio = AskUser(sc, "Ваше ФИО:");
        
        try {
            String inn = AskUserInn(sc);   
            System.out.println(fio + inn);
        } catch (Throwable e) {
            System.out.println(e.getLocalizedMessage());
        }
        finally{
            sc.close();
        }
    }

    public static String AskUserInn(Scanner sc) throws InvalidDocumentException{
        String inn = AskUser(sc, "ИНН");

        if(!VerifyINN(inn)){
            throw new InvalidDocumentException("Inn is invalid");
        }

        return inn;
    }

    public static String AskUser(Scanner sc, String text){
        System.out.println(text);
        return sc.next();
    }


    public static Boolean VerifyINN(String doc){
        Pattern pattern = Pattern.compile("\\d{12,12}");
        Matcher matcher = pattern.matcher(doc);

        return doc.length() == 12 && matcher.find();
    }
}
