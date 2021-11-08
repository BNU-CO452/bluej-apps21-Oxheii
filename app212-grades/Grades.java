
/**
 * These are the grades used by BNU to categorise 
 * students at the end of their course 
 * Each value represents the highest percentage mark for that grade
 * @author Richard Okon Ochei
 * @version 1.0 29/10/2021
 */
public enum Grades
{
    NS (0), 
    F  (39), 
    D  (49), 
    C  (59), 
    B  (69), 
    A  (100);
    
    private final int value;
    
    private Grades(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}
