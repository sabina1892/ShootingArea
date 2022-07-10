package lesson2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FaceControlApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", "What is your name? \n");
        String name = in.nextLine();
        System.out.printf("Name is %s", name );
        System.out.printf("%s", "How old are you \n");
        int age = in.nextInt();
        if (age>18){
            System.out.println("Hello");
        }
        else {
            System.out.printf("%s", "You are younger than 18");
        }

    }
}
