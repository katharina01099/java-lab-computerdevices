import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("Logitech");
    }

    @Test
    public void canGetBrand(){
        assertEquals("Logitech", mouse.getBrand());
    }

    @Test
    public void canSetBrand(){
        mouse.setBrand("Samsung");
        assertEquals("Samsung", mouse.getBrand());
    }

    @Test
    public void canClick(){
        assertEquals("Click", mouse.click());
    }

    @Test
    public void canSendData(){
        assertEquals("click from Mouse", mouse.sendData());
    }
}
