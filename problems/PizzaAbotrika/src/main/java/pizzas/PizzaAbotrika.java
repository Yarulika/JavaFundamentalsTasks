// README.md has detailed task description

package pizzas;

import java.util.Scanner;

public class PizzaAbotrika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //User input
        int noFriends = input.nextInt(); //Number of friends

        if (noFriends < 0 || noFriends > 10000) {
            System.out.println("Guests expected number: N, 0 ≤ N ≤ 10 000 ");
            System.exit(1);
        }

        String[] arrayPizzas = new String[noFriends]; // array of size noFriends
        input.nextLine(); //have to move to the new line after nextInt()
        for (int i = 0; i < noFriends; i++) // used for loop for user input
        {
            arrayPizzas[i] = input.nextLine(); // Assigned users value to array
        }

        //-----------------------logic----------------------------
        // Types of pizza: type1/2, type 3/4, type 1/4
        float type1_2No = 0;
        int type3_4No = 0;
        int type1_4No = 0;
        float pizzasCounter = 1; //pizza for Abotrika

        //Counting types of pizza
        for (int i = 0; i < noFriends; i++) {
            String strPizzaSize = arrayPizzas[i];
            switch (strPizzaSize) {
                case "1/2":
                    type1_2No += 1;
                    break;
                case "3/4":
                    type3_4No += 1;
                    break;
                case "1/4":
                    type1_4No += 1;
                    break;
                default:
                    System.out.println("no match");
            }
        }
        //need whole pizzas for type3/4
        pizzasCounter += type3_4No;
        //plus need in type 1/2
        pizzasCounter += (type1_2No / 2);
        //plus extra need of Type1_4
        //can fit some 1/4 into what is left after 3/4 and count how much more is needed
        float extraNeedInType1_4 = 0;
        if (type1_4No > type3_4No) {
            extraNeedInType1_4 = type1_4No - type3_4No;
            pizzasCounter += extraNeedInType1_4 / 4;
        }
        // pizzasCounter
        System.out.println(Math.round(Math.ceil(pizzasCounter)));
    }
}
