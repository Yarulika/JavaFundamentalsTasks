import java.util.Scanner;

// The task is to count numbers that have all the digits the same (like 2222) from the given range [a, b].
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countRangers = input.nextInt();
        input.nextLine();
        int[] resultNumbersSet = new int[countRangers];
        for (int i = 0; i < countRangers; i++) {
            String inputRange = input.nextLine();
            resultNumbersSet[i] = countNumbersWithSameDigits(inputRange);
        }
        for (int output : resultNumbersSet) {
            System.out.println(output);
        }
    }

    static int countNumbersWithSameDigits(String inputRange) {
        String[] range = inputRange.split(" ");
        int rangeStart = Integer.parseInt(range[0]);
        int rangeEnd = Integer.parseInt(range[1]);
        int numbersCounter = 0;
        for (int i = rangeStart; i <= rangeEnd; i++) {
            numbersCounter += checkNumberWithSameDigits(i);
        }
        return numbersCounter;
    }

    static int checkNumberWithSameDigits(int num) {  //returns 1 if number consists of the same digits
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
