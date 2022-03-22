import java.util.Scanner;

public class WordFindRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        AllGrid mega = new AllGrid();
        String[][] box = new String[5][6];
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
        String answer = "null";
        while(!answer.equals("e")){
            System.out.println("(P)lay game");
            System.out.println("(C)heck previous game board");
            System.out.println("(E)nd game");
            System.out.print("Input: ");
            answer = scan.nextLine();
            if(answer.toLowerCase().equals("p")){
                int index = 0;
                WordFind test = new WordFind();
                while(index < 6){
                    System.out.print("Input your " + (index + 1) + " guess: ");
                    answer = scan.nextLine();
                    while(!test.checkLegit(answer)) {
                        System.out.print("Word not found, input again: ");
                        answer = scan.nextLine();
                    }
                    test.fillArray(answer);
                    if(test.fillGrid(index)){
                        test.printGrid(index);
                        System.out.println("You find the correct word in " + (index + 1) + " try!");
                        System.out.println("Congratulations! You won the game!");
                        break;
                    }
                    else{
                        test.printGrid(index);
                        System.out.println("The word is not correct. Keep Finding!");
                    }
                    index++;
                    if(index == 6){
                        System.out.println("You lost the game!");
                        System.out.println("The correct word is " + test.getTarget());
                    }
                }
                box = test.getBox();
                mega.addBox(box);
            }
            else if(answer.toLowerCase().equals("c")){
                mega.print();
            }

            else if(answer.toLowerCase().equals("e")){
                System.out.println("Terminated.");
            }

            else{
                System.out.println("Wrong input!");
            }
        }
    }
}
