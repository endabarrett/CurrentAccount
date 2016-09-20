/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.enda.currentaccount.Account;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author 0102835s
 */
public class SimpleTest {
    
    @Test
    public void evaluatesExpression() {
    Account acc = new Account("Enda", 100);
    assertEquals(acc.getName(), "Enda");
  } 
    
}
