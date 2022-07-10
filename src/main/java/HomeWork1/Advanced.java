package HomeWork1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Advanced {
    private static int[] givenNumbers = new int[1];

    public static void growArray() {
        givenNumbers = Arrays.copyOf(givenNumbers, givenNumbers.length+1 );
    }
    static void bubbleSort(int[] givenNumbers) {
        int n = givenNumbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (givenNumbers[j - 1] > givenNumbers[j]) {
                    temp = givenNumbers[j - 1];
                    givenNumbers[j - 1] = givenNumbers[j];
                    givenNumbers[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write your name: ");
        String name = sc.next();
        Random rand = new Random();
        int n = rand.nextInt(100);
        int given = 0;
        System.out.println("Let the game begin!");
        while(true) {
            System.out.println("Enter the number: ");
            given = sc.nextInt();
            givenNumbers[givenNumbers.length - 1] = given;
            if (given == n) {
                System.out.printf("Congratulations, %s ", name);
                break;
            }
            else if (given < n) {
                System.out.println("Your number is too small. Please, try again: ");
            }
            else if (given > n) {
                System.out.println("Your number is too big. Please, try again.: ");
            }
            else {System.out.println(" ");};
            growArray();
        }

        bubbleSort(givenNumbers);
        for (int i = 0; i < givenNumbers.length; i++) {
            System.out.print( givenNumbers[i] + " ");
        }
    }
}


