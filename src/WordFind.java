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
        for(int i = 1; i <= message.length(); i++){
            userWord[i-1] = message.substring(i-1, i);
        }
    }

    public String[] getUserWord(){
        return userWord;
    }

    public boolean fillGrid(int rowIndex){
        String str = "";
        for(int i = 0; i < userWord.length; i++){
            if(target.indexOf(userWord[i]) != -1 && userWord[i].equals(target.substring(i,i+1))){
                box[rowIndex][i] = (Function.BLUE + userWord[i] + Function.WHITE);;
            }
            else if(target.indexOf(userWord[i]) != -1 && !userWord[i].equals(target.substring(i,i+1))){
                box[rowIndex][i] =(Function.YELLOW + userWord[i] + Function.WHITE);
            }
            else{
                box[rowIndex][i] = userWord[i];
            }
        }
        for(int i = rowIndex; i < rowIndex + 1; i++){
            for(int j = 0; j < box[0].length; j++){
                str += box[i][j];
            }
        }
        System.out.println(str);
        if(str.equals(target)){
            return true;
        }
        return false;
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
