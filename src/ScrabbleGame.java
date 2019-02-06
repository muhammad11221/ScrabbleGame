import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.Scanner;

public class ScrabbleGame {
    public static void main(String[] args) {
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        int randomletters = input.nextInt();
        input.nextLine();
        Random rnd = new Random();
        String inputt;

        do {
            String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                    "u", "v", "w", "x", "y", "z"};


            for (int i = 0; i < randomletters; i++) {

                num = rnd.nextInt(letters.length);
                System.out.print(letters[num]);


            }
            if ((letters[num].contains("a")) || (letters[num].contains("e"))
                    || (letters[num].contains("i")) || (letters[num].contains("o"))
                    || (letters[num].contains("u"))) {
                System.out.println(" "+ "might be a word.\n");
            } else {

                System.out.println(" "+"is not a word.\n");
            }
            System.out.println("Do you wana play again? ");
            inputt = input.nextLine();
            if (inputt.equalsIgnoreCase("no")){
                break;
            }
            System.out.println("Enter length: ");
            randomletters = input.nextInt();
            input.nextLine();

        }
        while(inputt.equalsIgnoreCase("Yes"));
        System.out.println("Thanks for playing!");
    }
}