package HomeWork1;
import java.util.Random;
import java.util.Scanner;

public class numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, write your name: ");
            String name = sc.next();
            Random rand = new Random();
            int n = rand.nextInt(100);
            System.out.println("Let the game begin!");

            while(true)
            {
                System.out.println("Enter the number: ");
                int i = sc.nextInt();
                if(i==n){
                    System.out.printf("Congratulations, %s ",name);
                    break;
                }

                else if(i<n){
                    System.out.println("Your number is too small. Please, try again: ");
                }
                else if(i>n){
                    System.out.println("Your number is too big. Please, try again.: ");
                }
            }
        }
}


