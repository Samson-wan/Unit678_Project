public class WordFind{
    private String[] userWord;
    private String target;
    private  String[][] box;

    public WordFind(){
        Word word = new Word();
        LetterGrid grid = new LetterGrid(5, 6);
        userWord = new String[5];
        target = word.getRandomWord();
        box = grid.getGrid();
    }

    public void fillArray(String message){ //assume message has a length of 5
        for(int i = 1; i < message.length(); i++){
            userWord[i-1] = message.substring(i-1, i);
        }
    }

    public String[] getUserWord(){
        return userWord;
    }

    public void fillGrid(int rowIndex){
        for(int i = 0; i < userWord.length; i++){
            if(target.indexOf(userWord[i]) != -1 && userWord[i].equals(target.substring(i,i+1))){
                box[rowIndex][i] = (Color.GREEN + userWord[i]);
            }
        }
    }

    public void printGrid(){
        for(String[] row : box){
            for(String letter : row){
                System.out.print(letter);
            }
            System.out.println();
        }

    }
}
