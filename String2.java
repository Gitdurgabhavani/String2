1.Write a simple String program to take input from user.
Ans.    import java.util.Scanner;
        public class UserInputExample {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}


2.How do you concatenate two strings in java?Give an example
Ans.in Java, two strings can be concatenated by using the + or += operator, or through the concat() method.
    String str1 = "Hello";
    String str2 = "World";
    String result = str1 + " " + str2;
    System.out.println(result); 
    output: "Hello World"


3.How do you find the length of a string in java explain with an example.
Ans.String str = "Hello World";
    int length = str.length();
     System.out.println("The length of the string is: " + length);
    output: "The length of the string is: 11"


4.How do you compare two strings in java ?Give an example
Ans.There are three ways to compare String in Java: By Using equals() Method. By Using == Operator.
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "World";
    if (str1.equals(str2)) {
    System.out.println("str1 and str2 are equal"); 
    } else 
    {
    System.out.println("str1 and str2 are not equal");
    }
Ex:output: "str1 and str2 are equal"

5.write a program to find the length of the string "refridgerator".
Ans.public class StringLengthExample {
    public static void main(String[] args) {
        String str = "refrigerator";
        int length = str.length();
        System.out.println("The length of the string is: " + length);
    }
}


6.write a program to check if the letter 'e' is present in the word 'Umbrella'.
Ans.public class CheckLetterExample {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean containsE = word.contains("e");
        if (containsE) {
            System.out.println("The word contains the letter 'e'");
        } else {
            System.out.println("The word does not contain the letter 'e'");
        }
    }
}


7.write a program to delete all consonants from the string "Hello, have a good day".
Ans.public class DeleteConsonantsExample {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        str = str.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
        System.out.println("The new string is: " + str);
    }
}
