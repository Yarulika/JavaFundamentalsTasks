package palindrome;

import java.util.Hashtable;
import java.util.Scanner;

//import java.sql.SQLOutput;
//import java.util.Enumeration;
//import java.util.Hashtable;
//import java.util.Scanner;

/**
 * Can be palindrome:
 *       The task is to check if letters of the given string can create palindrome
 *       after changing the order. For example the string abcabc can be transformed
 *       to palindrome e.g. abccba. However, the string abc can not.
 */
public class Palindrome {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int noLines = input.nextInt();
        input.nextLine();
        char charResult=3;
        char [] arrResults = new char[noLines];

        for (int i=0; i<noLines;i++){

            String strFromInput = input.nextLine(); //"abrabrt";
            String [] arrInput = strFromInput.split("");
            charResult = isPalindrome(arrInput);
            //System.out.println("charResult= "+charResult);
            arrResults[i] = charResult;
        }

        for (char output:arrResults)
        { System.out.println(output);
        }
    }

    static char isPalindrome(String [] arrInput){
        Hashtable<String, Boolean> hashTbl = new Hashtable<String, Boolean>();

        for (int i=0; i<arrInput.length;i++){
            if (hashTbl.containsKey(arrInput[i])){
                //if key already exist - change only value: true to false, false - to true
                if (hashTbl.get(arrInput[i]) == true){
                    hashTbl.put(arrInput[i],false);
                }
                else if (hashTbl.get(arrInput[i]) == false){
                    hashTbl.put(arrInput[i],true);
                }
            }
            else {
                // Adding Key and Value pairs into hashtable
                hashTbl.put(arrInput[i],true);
            }
        }

        int intTrueCounter=0;
        for (boolean a: hashTbl.values()) {
            if (a == true) {
                intTrueCounter = intTrueCounter+1;
            };
        }

        if (intTrueCounter <= 1){
            //System.out.println("Palindrom= "+"1");
            return '1';
        }
        else {
            //System.out.println("Not palindrom= "+"0");
            return '0';
        }
    }
}
