package lesson2;

public class MultyArrayApp
{
    public static void main(String[] args) {
        int [][] mArr ={{1,2,3,},{4,5,6}};
        String[][] mArrString = {{"name","secondName", "class"},{"alex", "H","a"}};
        for ( int i=0; i<2; i++){
            for( int j=0; j<3; j++)
            {System.out.println(mArrString[i][j]);
        }}
    }
}
