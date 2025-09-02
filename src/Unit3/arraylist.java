package Unit3;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of pdts : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            products.add(sc.next());
        }
        Iterator<String> it = products.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(products);
        System.out.println("The sorted list is : ");
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());
    }    }
