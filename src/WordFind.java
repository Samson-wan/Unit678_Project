public class WordFind{
    private String[] userWord;
    private String target;
    private  String[][] box;
    private Word word;

    public WordFind(){
        word = new Word();
        LetterGrid grid = new LetterGrid(6, 5);
        userWord = new String[5];
        target = word.getRandomWord();
        box = grid.getGrid();
    }

    public boolean checkLegit(String msg){
        for(int i = 0; i < word.getDictionary().size(); i++){
            if(msg.equals(word.getDictionary().get(i))){
                return true;
            }
        }
        return false;
    }

    public String getTarget(){
        return target;
    }

    public void fillArray(String message){ //assume message has a length of 5
        for(int i = 1; i <= message.length(); i++){
            userWord[i-1] = message.substring(i-1, i);
        }
    }

    public boolean correctPosition(String letter, int row){
        if(row > 0){
            for(int i = 0; i < target.length(); i++){
                if(box[row-1][i].equals(Function.BLUE + letter)){
                    if(target.substring(i, i + 1).equals(letter)){
                        return true;
                    }
                }
            }
        }
        return false;
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
                if(!correctPosition(userWord[i], rowIndex)){
                    box[rowIndex][i] =(Function.YELLOW + userWord[i] + Function.WHITE);
                }
                else{
                    box[rowIndex][i] = userWord[i];
                }
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
        String colorTarget = "";
        for(int i = 0; i < target.length(); i++){
            colorTarget += Function.BLUE + target.substring(i, i + 1) + Function.WHITE;
        }
        if(str.equals(colorTarget)){
            return true;
        }
        return false;
    }

    public void printGrid(int index){
       for(int i = 0; i <= index; i++){
           for(int j = 0; j < 5; j++){
               System.out.print(box[i][j] + "   ");
           }
           System.out.println();
       }
       for(int i = index + 1; i < 6; i++){
           for(int j = 0; j < 5; j++){
               System.out.print(box[i][j] + "   ");
           }
           System.out.println();
       }
    }

    public String[][] getBox(){
        return box;
    }
}
