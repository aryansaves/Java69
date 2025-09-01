import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[][] = new int[2][3];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("enter value at index "+ i +" "+ j + " : ");
                n[i][j] = sc.nextInt();
            }
        }
        System.out.print("Array elements : \n");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("Index ["+ i +"]" + "["+ j +"]" + " :" + n[i][j] + "\n");
            }
        }
    }
}
