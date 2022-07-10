package lesson3;
import java.util.Random;
import java.util.Scanner;
public class RandomCharsApp {
    public static void main(String[] args) {
            Random rmd = new Random();
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            for ( int i=0; i< num; i++)
            {
                char ch = (char) (rmd.nextInt('z'-'a'+1)+'a');
                if(ch=='a' || ch=='i')
                    break;
                System.out.println(ch);
            }

    }
}
