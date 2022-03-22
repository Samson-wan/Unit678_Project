import java.util.ArrayList;
public class AllGrid {
    ArrayList<String[][]> gameGrids;

    public AllGrid(){
        gameGrids = new ArrayList<>();
    }

    public void addBox(String[][] newBox){
        gameGrids.add(newBox);
    }

    public void print(){
        for(int i = 0; i < gameGrids.size(); i++){
            for(String[] row: gameGrids.get(i)){
                for(String letter : row){
                    System.out.print(letter + "   ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Next Grid");
        }
    }
}
