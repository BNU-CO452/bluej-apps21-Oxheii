
/**
 * Program class which initialises StockApp
 *
 * @author Richard Ochei
 * @version 0.1 20/11/2021
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
