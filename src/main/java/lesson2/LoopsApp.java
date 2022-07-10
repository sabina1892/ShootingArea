package lesson2;

//import java.util.Random;

public class LoopsApp {
    public static void main(String[] args) {
    /*    for (int i=0; i<10; i+=2){
            System.out.println(i);

        }*/
    /*   Random rmd = new Random();
       for ( int i=0; i<10; i++){
            System.out.println(rmd.nextInt( 3));
        }*/
     /*   int incOne = 1;
        int incTwo = 1;

        System.out.println(incOne++);
        System.out.println(++incTwo);*/
      /*  for(int i=0; i<10;i++) {
            System.out.print("i ");
            for (int j = 0; j < 10; j++) {
                System.out.print("j \n");
            }
        }
*/
        for ( int i=0; i<10; i++)
        {
            if( i% 2 == 0){
                continue;}
            i= i+1;
            if(i==5)
                break;
            System.out.println(i);
        }


    }
}
