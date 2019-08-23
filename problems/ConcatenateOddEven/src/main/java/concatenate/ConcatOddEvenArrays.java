package concatenate;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatOddEvenArrays {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in); //User input
        int noDataRows = input.nextInt();
        String [] arrStrInts = new String[noDataRows]; // Intilized array of size noDataRows
        input.nextLine();//have to move to the new line after nextInt()

        for (int k=0; k< noDataRows; k++){
            arrStrInts[k] = input.nextLine(); // Assigned users value to array
        }

        for (int k=0; k< noDataRows; k++){
            SortOddEven(arrStrInts[k]);
        }
    }

    static void SortOddEven(String input){
        String[] parts = input.split(" ");
        int[] arrOfInts = new int[parts.length];

        for (int g=0; g<parts.length;g++){
            arrOfInts[g] = Integer.parseInt(parts[g]);
        }

        int lengthOddEven = arrOfInts.length/2;
        int[] arrOfEven = new int[lengthOddEven];
        int[] arrOfOdd = new int[lengthOddEven];
        int idxEven=0; int idxOdd=0;

        Arrays.sort(arrOfInts);
        for (int i=0; i<arrOfInts.length; i++) //checking in element is odd or even, filling arrOfEven and arrOfOdd
        {
            if ((arrOfInts[i] % 2) == 0){
                //even
                //System.out.println("even = "+ arrOfInts[i]);
                arrOfEven[idxEven] = arrOfInts[i];
                idxEven++;
            }
            else {
                //odd
                //System.out.println("odd = "+ arrOfInts[i]);
                arrOfOdd[idxOdd] = arrOfInts [i];
                idxOdd++;
            }
        }
        // concatenating into output arrOfIntsSorted: from smallest odd-even-odd-even...
        String strIntsSorted = "";
        for (int j=0; j<lengthOddEven; j++){
            //String.join("-",)
            strIntsSorted = strIntsSorted + arrOfOdd[j] + "-";
            strIntsSorted = strIntsSorted + arrOfEven[j] + "-";
        }
        //System.out.println("Result = " + strIntsSorted);

        strIntsSorted = strIntsSorted.substring(0, strIntsSorted.length() - 1);
        System.out.println(strIntsSorted);
    }
}
