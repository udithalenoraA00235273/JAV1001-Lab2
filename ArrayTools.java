 /* This code is written fullfil below requirements,
 1. To encrypt a name user wants (Automatically decrypting too).
 2. Can get the average of an array.
 3. Can search for a exact value which contains in the array.
 4. Can print the reverse order of the array.

 Student Informations,
 Name - Uditha Lenora
 Student ID - A00235273
*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ArrayTools {
    public static void main(String[] args) {

        int[] numbers = { 44, 78, 45, 77, 44, 98, 67, 68, 91, 54 } ;

        // Get the user input
        Scanner input = new Scanner(System.in);

        //execute  methods
        encrypt(input);
        arrayAvg(numbers);
        arrayContains(input, numbers);
        reverseArray(numbers);
    }

    public static void encrypt(Scanner input) {
        // Encrypted text user wants

        System.out.print("Enter a String to encrypt - ");
        String encryptName = input.nextLine();
        // Encrypted value user wants

        System.out.print("Enter a value to encrypt with - ");
        int encryptValue = input.nextInt();

        // Encrypt  process (Using the char)
        String userMessage = encryptName;
        String encriptedText ="";
        int userValue = encryptValue;
        char[] characters = userMessage.toCharArray();
        for (char i : characters) {
            i += userValue;
            encriptedText += i;
        }
        System.out.println("\nThe encrypted value is " + encriptedText);

        System.out.println("Decrypting " + encriptedText + " with -" + userValue + "...");
        // Decrypt  process (Reverse code of encryption)
        char[] dCharacters = encriptedText.toCharArray();
        for (char i : dCharacters) {
            i -= userValue;
            System.out.print(i);
        }
        System.out.println("");
    }


    public static void arrayAvg(int[] numbers) {

        double totalValue = 0;

        // To get the average of the array (for loop)
        for (int i = 0; i < numbers.length; i++) {
            totalValue = totalValue + numbers[i];
        }
        double averageValue = totalValue / numbers.length;
        System.out.println("Testing methods with [ 44 78 45 77 44 98 67 68 91 54 ]");
        System.out.println("The average is " + averageValue);
    }

    // Value searching from the array (if statement)
    public static void arrayContains(Scanner input, int[] numbers) {

        System.out.print("Enter a value to search for. ");
        int arrayInput = input.nextInt();
        boolean value = false;

        for (int x : numbers) {
            if (x == arrayInput) {
                value = true;
                break;
            }
        }
        String printCondition = null;
        if(value == false) {
            printCondition = " not ";
        }
        else {
            printCondition = " ";
        }
        System.out.println("The array" + printCondition + "contains " + arrayInput);
    }

    //Reverse Array (for loop)
    public static void reverseArray(int[] numbers) {

        int[] reversNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversNumbers[numbers.length - (i + 1)] = numbers[i];
        }
        System.out.print("Reversed array is: ");
        for (int k = 0; k < reversNumbers.length; k++) {
            System.out.print(reversNumbers[k] + " ");
        }
    }
}
