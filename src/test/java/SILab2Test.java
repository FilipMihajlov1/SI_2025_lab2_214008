import org.example.Item;
import org.example.SILab2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {
    private final SILab2 siLab2 = new SILab2();

    @Test
    public void testCheckName() { //item with null name and empty name should throw an exception
        Item item= new Item(null,1,200,1);
        assertThrows(RuntimeException.class,() -> SILab2.checkCart(List.of(item),"1234567890123456"),
                "Invalid item!");
        Item item3= new Item("",1,200,1);
        assertThrows(RuntimeException.class,() -> SILab2.checkCart(List.of(item3),"1234567890123456"),"" +
                "Invalid item!");
    }
    @Test
    public void testCheckList(){//Empty list should throw an exception
        assertThrows(RuntimeException.class,() -> SILab2.checkCart(null,"1234567890123456"),"" +
                "allItems list can't be null!");
    }
    @Test
    public void testCheckCard(){//not valid card number should throw an expcetion
        Item item1= new Item("Pen",1,300,1);
        assertThrows(RuntimeException.class,() -> SILab2.checkCart(List.of(item1),"1234adsd90123456"),"" +
                "Invalid card number!");
    }
}
