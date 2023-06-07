# Vigenere-Cypher
This program implements the Vigenère cipher encryption algorithm. The Vigenère cipher is a method of encrypting alphabetic text using a series of interwoven Caesar ciphers based on the letters of a keyword. Each letter of the keyword determines the shift applied to the corresponding letter of the plaintext.


## Getting Started
To run the program, follow these steps:

1. Ensure you have Java installed on your system.
2. Compile the Java file Main.java using a Java compiler.
3. Run the compiled Java program.


## Usage
Upon running the program, you will be prompted to enter a message and a keyword. The message should be the text you wish to encrypt, and the keyword should be a word used as the encryption key. The program will then encrypt the message using the Vigenère cipher and display the encrypted message.

Please note the following:

- The Vigenère cipher only works with alphabetical characters. Non-alphabetical characters will be removed from the input message and keyword.
- All letters in the input message and keyword will be converted to uppercase.
- The program assumes the input message and keyword are in English.


## Example
Here's an example usage of the program:

```
Please enter a message:
Hello World!
Please enter a keyword:
SECRET

Encrypted message: UHZLVYQTDB
```

In this example, the message "Hello World!" is encrypted using the keyword "SECRET". The resulting encrypted message is "UHZLVYQTDB".


## Implementation Details
The program consists of the following components:

Main class: This class contains the main method responsible for executing the encryption process. It utilizes the Scanner class to get user input and calls the format method to clean and format the input message and keyword. It then applies the Vigenère cipher algorithm to encrypt the message and displays the encrypted message.

format method: This method takes a string as input and removes all non-alphabetical characters, removes digits, and converts all letters to uppercase. It returns the formatted string.


## Academic Integrity
The code provided in this program is the original work of Zain Parihar and conforms to the academic integrity standards of Queen’s University.
