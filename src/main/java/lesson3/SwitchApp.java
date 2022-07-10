package lesson3;

import java.sql.SQLOutput;

public class SwitchApp {
    public static void main(String[] args) {
        int i=2;
 //       System.out.println(i == 2 ? "OK": i==10 ? "ten" : "Not OK");
        switch (i)
        {
            case 1:
                System.out.println("one"); break;
            case 2:
                System.out.println("Two"); break;
            default:
                System.out.println("def"); break;
        }
    }
}
