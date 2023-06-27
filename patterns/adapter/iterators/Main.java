package adapter.iterators;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Vector<Integer> vector = new Vector<>(list);
        Iterator<Integer> iterator = list.iterator();
        Enumeration<Integer> enumeration = vector.elements();

        printIterator(new EnumerationAdapter<>(enumeration));
        printEnumeration(new IteratorAdapter<>(iterator));
    }

    private static void printIterator(Iterator<?> iter) {
        System.out.println("===== Iterator =====");
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
        }
        System.out.println("\b\b\n");
    }

    private static void printEnumeration(Enumeration<?> enumeration) {
        System.out.println("===== Enumeration =====");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + ", ");
        }
        System.out.println("\b\b\n");
    }
}
