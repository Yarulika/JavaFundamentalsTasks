import java.util.Scanner;

// The task is to count numbers that have all the digits the same from the given range [a, b].
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noLines = input.nextInt();
        input.nextLine();
        int[] arrResults = new int[noLines];
        for (int i = 0; i < noLines; i++) {
            String strFromInput = input.nextLine();
            arrResults[i] = countNumbersWithSameDigits(strFromInput);
        }
        for (int output : arrResults) {
            System.out.println(output);
        }
    }

    static int countNumbersWithSameDigits(String inputRange) {
        String[] arrRange = inputRange.split(" ");
        int intStart = Integer.parseInt(arrRange[0]);
        int intEnd = Integer.parseInt(arrRange[1]);
        int counter = 0;
        for (int i = intStart; i <= intEnd; i++) {
            counter += ifNumberWithSameDigits(i);
        }
        //System.out.println("counter= "+ counter);
        return counter;
    }

    static int ifNumberWithSameDigits(int num) {  //returns 1 if number consists of the same digits
        String strNum = Integer.toString(num);
        if (strNum.length() == 1) {
            return 1; //if number is out of just one digit
        } else {
            // if number has more than one digit
            for (int i = 1; i < strNum.length(); i++) {
                if (strNum.charAt(i) != strNum.charAt(0)) {
                    return 0;
                }
            }
            return 1;
        }
    }
}