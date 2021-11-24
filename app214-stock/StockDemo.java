


import java.util.*;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified Richard Ochei Okon
 * @version 0.1 20/11/2021
 */
public class StockDemo
{
    // The StockManager class dependencies.
    private StockManager manager;
    // Allows the demo to randomise structured test data
    private Random rand = new Random();
    /**
     * Create a StockManager and populate it with a few
     * sample products inside an arraylist with manager dependencies
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(12, "Playstation");
        manager.addProduct(13, "PS2");
        manager.addProduct(14, "PS3");
        manager.addProduct(15, "PS4");
        manager.addProduct(16, "PS5");
        manager.addProduct(17, "Xbox");
        manager.addProduct(18, "Xbox 360");
        manager.addProduct(19, "Xbox 1");
        manager.addProduct(20, "Xbox Series X");
        manager.addProduct(21, "Gaming PC");
        manager.addProduct(22, "Nintendo Switch");
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown
     * Uses a for loop and iterates ID to go through all data
     * Gives a range of 1-12 new stock
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
     * Uses a for loop and iterates ID to go through all data
     * Scans for the IDs max quantity avoiding any overselling
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
