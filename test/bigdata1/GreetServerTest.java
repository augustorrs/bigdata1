/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdata1;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Augusto Souza
 */
public class GreetServerTest {
    
    public GreetServerTest() {
    }
    
@Test
public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect()throws IOException {
 GreetClient client = new GreetClient();
 client.startConnection("127.0.0.1", 6666);
 String response = client.sendMessage("hello server");
 assertEquals("hello client", response);
} 
}