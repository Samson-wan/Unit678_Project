import jdk.swing.interop.DropTargetContextWrapper;

public class LetterGrid {
    private int rows;
    private int cols;
    private String[][] grid;

    public LetterGrid(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        grid = new String[rows][cols];
    }

    public String[][] getGrid(){
        return grid;
    }
}
