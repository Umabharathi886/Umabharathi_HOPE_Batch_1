
import java.util.*;
public class LinkedListImplementation{
    public static void main(String[] args) {
        List<String> running = new LinkedList<>();
        running.add("A");
        running.add("B");
        running.add("C");

        System.out.println(running);
        running.addFirst("Start race");
        System.out.println(running);
        running.remove("B");
        System.out.println("B is disqualified");
        System.out.println(running);
        running.addLast("race completed");
        System.out.println(running);
        System.out.println("A is winner");
        running.clear();
        System.out.println(running);


    }}
