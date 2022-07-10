package lesson2;
import java.util.Scanner;
public class mathapp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne = in.nextInt();
        int numberTwo = in.nextInt();
        int result = numberOne - numberTwo;
        int multiple = numberOne * numberTwo;
        System.out.println(result);
        System.out.println(multiple);
        int div = numberOne / numberTwo;
        int remind = numberOne % numberTwo;
        System.out.println(div);
        System.out.println(remind);
    }
}
