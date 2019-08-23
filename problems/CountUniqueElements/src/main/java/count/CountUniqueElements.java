package count;

import java.util.*;

public class CountUniqueElements {

    public static void main(String[] args) {
        CountUniqueElements countUE = new CountUniqueElements();
        Scanner sc = new Scanner(System.in);
        int sequenceNo = sc.nextInt();
        sc.nextLine();
        int threshold = sc.nextInt();
        sc.nextLine();
        List<String> inputCollection = new ArrayList<>();
        for (int i = 0; i < sequenceNo; i++) {
            inputCollection.add(sc.nextLine());
        }

        for (int j = 0; j < inputCollection.size(); j++) {
            String input = inputCollection.get(j);
            System.out.println(countUE.countUniqueElements(input, threshold));
        }
    }

    /**
     * @param inputString e.g. list = [5 5 5 5 6 6 6 7 7 8]
     * @return number of unique elements(the occurrence of the given number is greater than the specified threshold (k = 2))
     * k = 2
     * Occurences:
     * 5 : 4
     * 6 : 3
     * 7 : 2
     * 8 : 1
     * Only 5 and 6 are included the result.
     * Result = 2
     */
    private int countUniqueElements(String inputString, int threshold) {
        CountUniqueElements countUE = new CountUniqueElements();
        List<Integer> inputNumbers = countUE.convertStringToListInt(inputString);
        Map<Integer, Integer> occurencesMap = new HashMap<>();
        occurencesMap.put(inputNumbers.get(0), 1);
        for (int i = 0; i < inputNumbers.size(); i++) {
            if (!occurencesMap.containsKey(inputNumbers.get(i))) {
                occurencesMap.put(inputNumbers.get(i), 1);
            } else {
                occurencesMap.replace(inputNumbers.get(i), occurencesMap.get(inputNumbers.get(i)) + 1);
            }
        }
        int limit = threshold;
        int indexGreaterOccurrence = 0;
        for (Integer val : occurencesMap.values()) {
            if (val.compareTo(limit) == 1) {
                indexGreaterOccurrence++;
            }
        }
        return indexGreaterOccurrence;
    }

    private List<Integer> convertStringToListInt(String forConvert) {
        List<Integer> digitsFromLine = new ArrayList<>();
        String[] digitsArray = forConvert.split(" ");
        for (String d : digitsArray) {
            digitsFromLine.add(Integer.parseInt(d));
        }
        return digitsFromLine;
    }
}
