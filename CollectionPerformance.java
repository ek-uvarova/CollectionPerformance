import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Класс, реализующий подсчет времени для методов.
 */
public class CollectionPerformance {

    public static void main(String[] args) {
        int numIterations = 1000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.add(i);
        }
        long addArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.get(i);
        }
        long getArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = numIterations - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        long removeArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.size();
        }
        long sizeArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.indexOf(i);
        }
        long indexOfArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.lastIndexOf(i);
        }
        long lastIndexOfArrayListTime = System.nanoTime() - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.isEmpty();
        }
        long isEmptyArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        arrayList.clear();
        long clearArrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.add(i);
        }
        long addLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.get(i);
        }
        long getLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = numIterations - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        long removeLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.size();
        }
        long sizeLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.indexOf(i);
        }
        long indexOfLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.lastIndexOf(i);
        }
        long lastIndexOfLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.isEmpty();
        }
        long isEmptyLinkedListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        linkedList.clear();
        long clearLinkedListTime = System.nanoTime() - startTime;

        System.out.println("ArrayList performance:");
        System.out.println("Add: " + numIterations + "; time: " + addArrayListTime + " ns");
        System.out.println("Get: " + numIterations + "; time: " + getArrayListTime + " ns");
        System.out.println("Remove: " + numIterations + "; time: " + removeArrayListTime + " ns");
        System.out.println("Size: " + numIterations + "; time: " + sizeArrayListTime + " ns");
        System.out.println("IndexOf: " + numIterations + "; time: " + indexOfArrayListTime + " ns");
        System.out.println("LastIndexOf: " + numIterations + "; time: " + lastIndexOfArrayListTime + " ns");
        System.out.println("Clear: 1; time: " + clearArrayListTime + " ns");
        System.out.println("IsEmpty: " + numIterations + "; time: " + isEmptyArrayListTime + " ns");

        System.out.println("\nLinkedList performance:");
        System.out.println("Add: " + numIterations + "; time: " + addLinkedListTime + " ns");
        System.out.println("Get: " + numIterations + "; time: " + getLinkedListTime + " ns");
        System.out.println("Remove: " + numIterations + "; time: " + removeLinkedListTime + " ns");
        System.out.println("Size: " + numIterations + "; time: " + sizeLinkedListTime + " ns");
        System.out.println("IndexOf: " + numIterations + "; time: " + indexOfLinkedListTime + " ns");
        System.out.println("LastIndexOf: " + numIterations + "; time: " + lastIndexOfLinkedListTime + " ns");
        System.out.println("Clear: 1; time: " + clearLinkedListTime + " ns");
        System.out.println("IsEmpty: " + numIterations + "; time: " + isEmptyLinkedListTime + " ns");
    }
}