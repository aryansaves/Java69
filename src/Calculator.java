import java.util.*;
public class Calculator {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int x,y,z = 0;
        System.out.print("Enter any 2 number: ");
        x = sc.nextInt();
        y = sc.nextInt();
        try
        {
            z=x/y;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(z);
        }
    }
}
