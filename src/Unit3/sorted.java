package Unit3;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class sorted {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        System.out.println("enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sortedSet.add(sc.next());
        }
            System.out.println(sortedSet);
            System.out.println(sortedSet.subSet(sortedSet.first(), sortedSet.last()));
    }
}
