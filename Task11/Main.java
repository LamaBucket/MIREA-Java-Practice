package Task11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        
        // SUBTASK 1
        Date now = Now();

        Date completedDate = CreateDate(2024, Calendar.NOVEMBER, 19, 18, 4);

        System.out.println("Current: " + now.toString() + " Done: " + completedDate.toString());


        // SUBTASK 2 and 4
        now = Now();
        Date userInput = ReadFromConsole();

        System.out.println("At the moment of Input: " + now.toString() + " Done: " + userInput.toString());


        // SUBTASK 3
        Student gleb = new Student("Gleb", "Bannyy", CreateDate(2005, Calendar.OCTOBER, 14, 14, 5));

        System.out.println(gleb.toString("MM/dd/yyyy HH:mm:ss"));



        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Date startFillArrayList = Now();
        
        for(int i = 0; i < 2700000; i++){
            arrayList.add(i);
        }

        Date startFillLinkedList = Now();

        for(int i = 0; i < 2700000; i++){
            linkedList.add(i);
        }

        Date startClearArrayList = Now();

        for(int i = 2700000 - 1; i >= 0; i--){
            arrayList.remove(i);
        }

        Date startClearLinkedList = Now();

        for(int i = 2700000 - 1; i >= 0; i--){
            linkedList.remove(i);
        }

        Date finish = Now();

        System.out.println("Fill Array List took " + getDateDiff(startFillArrayList, startFillLinkedList, TimeUnit.MILLISECONDS) + " Milliseconds!");
        System.out.println("Fill Linked List took " + getDateDiff(startFillLinkedList, startClearArrayList, TimeUnit.MILLISECONDS) + " Milliseconds!");
        System.out.println("Clear Array List took " + getDateDiff(startClearArrayList, startClearLinkedList, TimeUnit.MILLISECONDS) + " Milliseconds!");
        System.out.println("Clear Linked List took " + getDateDiff(startClearLinkedList, finish, TimeUnit.MILLISECONDS) + " Milliseconds!");
    }

    private static Date Now(){
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }

    private static Date CreateDate(int year, int month, int day, int hour, int min){
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, min);

        return cal.getTime();
    }

    private static Date ReadFromConsole(){
        Scanner sc = new Scanner(System.in);

        int year;
        int month;
        int day;
        int hour;
        int min;

        System.out.println("Year");
        year = sc.nextInt();

        System.out.println("Month");
        month = sc.nextInt();

        while(month <= 0 || month >= 13){
            System.out.println("Month Incorrect. Try Again");
            month = sc.nextInt();
        }

        month -= 1;
        
        System.out.println("Day");
        day = sc.nextInt();

        System.out.println("Hour (24-format)");
        hour = sc.nextInt();

        System.out.println("Min");
        min = sc.nextInt();

        sc.close();

        return CreateDate(year, month, day, hour, min);
    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
}
