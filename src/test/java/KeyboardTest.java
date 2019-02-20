import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

import static org.junit.Assert.assertEquals;


public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("Logitech");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Logitech", keyboard.getBrand());
    }

    @Test
    public void canSetBrand(){
        keyboard.setBrand("Samsung");
        assertEquals("Samsung", keyboard.getBrand());
    }

    @Test
    public void canClickKey(){
        assertEquals("Click", keyboard.clickKey());
    }

    @Test
    public void canSendData(){
        assertEquals("click from Keyboard", keyboard.sendData());
    }


}
