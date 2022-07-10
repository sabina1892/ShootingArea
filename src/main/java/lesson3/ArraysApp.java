package lesson3;

public class ArraysApp {
    public static void main(String[] args) {
        int[] ar1; // 3 formada array
        int ar2[];
        int []ar3;
        String []str = new String [10];
        byte[] arrByte = {1,2,3,4,5};

  //    for ( int el:arrByte){
    //      System.out.println(el);
    //  }

     /*   System.out.println(arrByte.length);
        System.out.println(arrByte[2]);
        for( int i= arrByte.length; i>0; i--)
        {
            System.out.println(i);
        }*/
        str[0]= "name";
        str[1]= " classs";
        str [9] = "Nine";
        for (String el: str) {
            if(el== null){
            System.out.println(el);
            }
        }
   /*     Arrays.sort (arrByte):
        for ( int el:)*/
    }

}
