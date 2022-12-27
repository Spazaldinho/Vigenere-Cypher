/*
 * CISC-121 2022F
 * Name: Zain Parihar
 * Student Number: 10219553
 * Email: 21ZP16@queensu.ca
 * Date: 2022-09-16
 * I confirm that this assignment solution is my own work and
 * conforms to Queen’s standards of Academic Integrity
*/

//Import Scanner class, used to get user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //Declare scanner to receive data from the user
        Scanner sc = new Scanner(System.in);

        int ALPHABET_OFFSET = 65;
        int[][] numerical = new int[26][26];
        int filler = 0;
        int originalMessageLength = 0;
        int keyWordLength = 0;

        String originalMessage = "";
        String keyWord = "";
        String newCipherKey = "";
        String encryptedMessage = "";

        //This loop fills in a 2D array for alphabetical characters according to the constraints
        //of the Vigenère cipher
        for (int i = 0; i < 26; i++) {
            for (int k = 0; k < 26; k++) {
                numerical[i][k] = filler + ALPHABET_OFFSET;
                filler++;
                if (filler == 26) {
                    filler = 0;
                }
            }
            filler++;
        }
        
        //Prompt user for a message they would like to encrypt, and stores it
        //in the variable originalMessage
        System.out.println("Please enter a message:");
        originalMessage = sc.nextLine();

        //Prompt user for a key word, and stores it
        //in the variable keyword
        System.out.println("Please enter a key word");
        keyWord = sc.nextLine();

        //Format the user's desired message and keyword by executing the format() method
        originalMessage = format(originalMessage);
        keyWord = format(keyWord);

        //store length of the user's message in an integer
        originalMessageLength = originalMessage.length();

        //store length of the user's key word in an integer
        keyWordLength = keyWord.length();

        //This loop adds individual characters from the formatted keyword to create a new
        //Cipher key that is the same length as the message the user would like to encrypt
        for(int i = 0; i < originalMessageLength; i++) {
            newCipherKey += keyWord.charAt(i % keyWordLength);
        }

        //This loop encrypts individual characters, and adds them to a new string through the 
        //Vigenère cipher using the user's desired message and the new Cipher Key 
        for (int i = 0; i < originalMessage.length(); i++) {
            encryptedMessage += (char) (numerical[(int)originalMessage.charAt(i) - ALPHABET_OFFSET][(int)newCipherKey.charAt(i) - ALPHABET_OFFSET]);
        }
        
        //Print the encrypted message
        System.out.println(encryptedMessage);

        //Close Scanner
        sc.close();
    }

    //This method takes one String, s, as a parameter, and returns s formatted to remove all
    //non alphabetical characters, and capitalizes all letters
    public static String format(String s) {
        
        //Removes all non-words
        s = s.replaceAll("\\W", "");

        //Removes all digits
        s = s.replaceAll("\\d", "");

        //Capitalizes all letters
        s = s.toUpperCase();
        return s;
    }

}
