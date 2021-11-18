import java.util.*;
/**
 * Display the StockManager and Product classes. 
 * When the StockManager class is completed, 
 * the demonstration becomes properly functional.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified Richard Okon Ochei
 * @version 18/11/2021
 */
public class StockDemo
{
    // The StockManager class dependencies.
    private StockManager manager;
    // Allows the demo to randomise structured test data
    private Random rand = new Random();
    /**
     * Set up a StockManager with a few sample products in a list 
     * with dependents and populate it with the sample products
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(12, "PlayStation"));
        manager.addProduct(new Product(13, "PlayStation 2"));
        manager.addProduct(new Product(14, "PlayStation 3"));
        manager.addProduct(new Product(15, "PlayStation 4"));
        manager.addProduct(new Product(16, "PlayStation 5"));
        manager.addProduct(new Product(17, "PlayStation Portable"));
        manager.addProduct(new Product(18, "PlayStation Vita"));
        manager.addProduct(new Product(19, "PlayStation Virtual Reality"));
        manager.addProduct(new Product(20, "PlayStation Camera"));
        manager.addProduct(new Product(21, "PlayStation Dual-Shock Controller"));
        manager.addProduct(new Product(22, "PlayStation HDD"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. 
     * Displays the details of one product 
     * Iterates over all data using a loop and ID 
     * Gives a range of 1-12 new products
     */
    public void demoDelivery()
    {
        for(int id =12; id <= 22; id++)
        {
            manager.deliverProduct(id, rand.nextInt(12) + 1);
        }
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown
     * Scans for the max quantity of IDs to avoid any overselling in a for loop 
     * Iterates through all data with ID to go through all data
     */
    public void demoSell()
    {
        for(int id =12; id <= 22; id++)
        {   
            int stockQuantity = manager.numberInStock(id);
            if(stockQuantity < 1)
            {
                stockQuantity = 1;
            }
            manager.sellProduct(id, rand.nextInt(stockQuantity) + 1);
        }
    }
    
    /**
     * Runs all key tasks with the demo data provided
     */
    public void runDemo(String findName)
    {
        manager.findProduct(findName);
        manager.printAllProducts();
        demoDelivery();
        demoSell();
    }
}
