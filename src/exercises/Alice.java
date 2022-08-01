package exercises;
import java.util.Scanner;


public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String searchTerm = input.next().toLowerCase();

        String originalSentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was" +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                "thought Alice 'without pictures or conversation?'";

        String updatedSentence = originalSentence.replace(searchTerm, "");

        Integer index = originalSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();

        if (originalSentence.toLowerCase().contains(searchTerm))  {
            System.out.println("The sentence contains the term " + searchTerm + ".");
            System.out.println("The search term first appears at index " + index + ". The search term was " + searchTerm + " and is " + length + " characters long.");
            System.out.println(updatedSentence);


        } else {
            System.out.println("The sentence does not contain the term " + searchTerm + ".");

        }
    }

}

