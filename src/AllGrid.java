import java.util.ArrayList;
public class AllGrid {
    ArrayList<String[][]> gameGrids;

    public AllGrid(){
        gameGrids = new ArrayList<>();
    }

    public void addBox(String[][] newBox){
        gameGrids.add(newBox);
    }
}
