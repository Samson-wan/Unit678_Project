import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Word {
    private ArrayList<String> dictionary;
    private String randomWord;

    public Word(){
        importDictionary();
        int index = (int)(Math.random() * dictionary.size());
        randomWord = "hello";
//                dictionary.get(index);
    }

    public ArrayList<String> getDictionary(){
        return dictionary;
    }

    public String getRandomWord(){
        return randomWord;
    }

    private void importDictionary()
    {
        String[] tmp = null;
        try
        {
            FileReader fileReader = new FileReader("src\\5Word.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> lines = new ArrayList<String>();
            String line = null;

            while ((line = bufferedReader.readLine()) != null)
            {
                lines.add(line);
            }

            bufferedReader.close();
            tmp = lines.toArray(new String[lines.size()]);
            System.out.println("\nFile imported successfully!");
        }
        catch (IOException e)
        {
            System.out.println("Error importing file; unable to access "+ e.getMessage());
        }

        dictionary = new ArrayList<String>(Arrays.asList(tmp));
    }
}
