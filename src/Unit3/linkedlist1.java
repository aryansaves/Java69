package Unit3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList <Integer> ll1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int  n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            ll1.add(sc.nextInt());}
            Iterator it = ll1.descendingIterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            Collections.sort(ll1);
            System.out.println(ll1);
            System.out.println("min " + ll1.getFirst());
            System.out.println("max " + ll1.getLast());
        }

    }

