package Task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        
        Scanner sc = new Scanner(System.in);
        
        Matcher matcher = pattern.matcher(sc.nextLine());

        System.out.println(matcher.find() ? "Match!" : "No match...");

        String currencies = sc.nextLine();

        MatchCurrency(currencies, "USD");
        MatchCurrency(currencies, "EU");
        MatchCurrency(currencies, "RUB");


        String math = sc.nextLine();
        pattern = Pattern.compile("\\+ \\d+ *");
        matcher = pattern.matcher(math);

        System.out.println(matcher.find() ? matcher.group() : "No match...");

        sc.close();
    }

    private static void MatchCurrency(String str, String curr){
        Pattern pattern;
        Matcher matcher;
        
        pattern = Pattern.compile("\\d+\\.\\d+ " + curr);
        matcher = pattern.matcher(str);

        if(matcher.find()){
            System.out.println(matcher.group());
        }
        else{
            System.out.println("Match Not Found For " + curr);
        }
    }
}
