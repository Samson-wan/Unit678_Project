public class Function {
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\033[0;34m";
    public static final String WHITE = "\u001B[37m";

    public static void sleep(int ms)
    {
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException ignored)
        {

        }
    }
}
