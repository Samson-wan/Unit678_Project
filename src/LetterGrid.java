import jdk.swing.interop.DropTargetContextWrapper;

public class LetterGrid{
    private int rows;
    private int cols;
    private final String[][] grid;

    public LetterGrid(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        grid = new String[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                grid[i][j] = "-";
            }
        }
    }

    public String[][] getGrid(){
        return grid;
    }
}
