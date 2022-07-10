import java.io.PrintStream;
import java.util.Scanner;
public class CharsApp {
    public static void main(String[] args){
        System.out.println();
        PrintStream out =System.out;
        out.println();
        Scanner sn = new Scanner (System.in);
        out.println("Enter your name: ");
        String myName = sn.nextLine();
        out.println("Hello, " +myName);
        int age=sn.nextInt();
        out.println("My age is:" + age);
    }


}
