package concatenate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcatOddEvenLists {

    public static void main(String[] args) {
        ConcatOddEvenLists concat = new ConcatOddEvenLists();
        List<String> inputCollection = concat.getInput();
        for (int i=0; i<inputCollection.size(); i++){
            concat.printSortedLineOddEvens(inputCollection.get(i));
        }
    }

    /**
     *
     * @param forConvert String of numbers will be converted like:
     *                   smallest odd number - smallest even - next smallest odd - next smallest even
     *                   e.g.: [8, 7, 6, 5] -> 5-6-7-8
     */
    private void printSortedLineOddEvens(String forConvert){
        ConcatOddEvenLists concat = new ConcatOddEvenLists();
        List<Integer> numbers = new ArrayList<>();
        numbers = concat.convertStringToListInt(forConvert);

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        while (numbers.size() > 0) {
            Integer forMove = concat.getSmallest(numbers);
            if ((forMove % 2) == 0) {
                evenNumbers.add(forMove);
                numbers.remove(forMove);
            } else {
                oddNumbers.add(forMove);
                numbers.remove(forMove);
            }
        }
        String output = "";
        for (int j = 0; j < evenNumbers.size(); j++) {
            output += oddNumbers.get(j).toString() + "-";
            output += evenNumbers.get(j).toString() + "-";
        }
        output = output.substring(0, output.length()-1);
        System.out.println(output);
    }

    private Integer getSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }
        return smallest;
    }

    private List<Integer> convertStringToListInt(String forConvert) {
        List<Integer> digitsFromLine = new ArrayList<>();
        String[] digitsArray = forConvert.split(" ");
        for (String d : digitsArray) {
            digitsFromLine.add(Integer.parseInt(d));
        }
        return digitsFromLine;
    }

    private List<String> getInput() {
        Scanner sc = new Scanner(System.in);
        int sequenceNo = sc.nextInt();
        //System.out.println("no=" + sequenceNo);
        sc.nextLine();
        List<String> inputCollection = new ArrayList<>();
        for (int i = 0; i < sequenceNo; i++) {
            inputCollection.add(sc.nextLine());
        }
        return inputCollection;
    }

    private void printList(List al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
