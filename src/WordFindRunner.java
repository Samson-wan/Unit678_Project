import java.util.Scanner;

public class WordFindRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int index = 0;
        System.out.println("This is a wordle game.");
        Function.sleep(200);
        System.out.println("You have 6 chances to guess a 5-letter word.");
        Function.sleep(200);
        System.out.println("Blue letter indicates the word is in the correct position.");
        Function.sleep(200);
        System.out.println("Yellow letter indicates the word contains the letter but in wrong position.");
        Function.sleep(200);
        System.out.println("White/Gray letter indicates the word does not contain the letter.");
        Function.sleep(200);
        while(index < 6){
            System.out.print("Input your " + (index + 1) + " guess: ");
            String answer = scan.nextLine();
            WordFind test = new WordFind();
            test.fillArray(answer);
            if(test.fillGrid(index)){
                System.out.println("You find the correct word in " + (index + 1) + " try!");
            }
            else{
                System.out.println("The word is not correct. Keep Finding!");
            }
            index++;
            if(index == 6){
                System.out.println("You lost the game!");
            }
        }
    }
}
