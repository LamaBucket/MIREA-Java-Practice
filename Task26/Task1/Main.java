package Task26.Task1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args){
        ArrayList array = new ArrayList();

        for (int i = 20; i < 30; i++){
            array.add(i);
        }

        System.out.println("Исходный массив: ");
        System.out.println(array);

        ListIterator<Integer> forwardIterator = array.listIterator();
        ListIterator<Integer> backwardIterator = array.listIterator(array.size());

        while (forwardIterator.nextIndex() < backwardIterator.previousIndex()){
            Integer first = forwardIterator.next();
            Integer last = backwardIterator.previous();

            forwardIterator.set(last);
            backwardIterator.set(first);
        }

        System.out.println("Измененный массив:");
        System.out.println(array);
    }
}
