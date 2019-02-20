import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer computer;
    Monitor monitor;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("Logitech");
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

//------------------------------------------------------------------------------------------
    @Test
    public void hasInputDevice() {
        IInput inputDevice = computer.getInputDevice();
        assertNotNull(inputDevice);
    }

    @Test
    public void canSetInputDevice(){
        Keyboard keyboard = new Keyboard("Epson");
        computer.setInputDevice(keyboard);
        assertEquals("click from Keyboard", computer.inputData());
    }

    @Test
    public void canInputDataViaMouse() {
        assertEquals("click from Mouse", computer.inputData());
    }

    @Test
    public void canInputDataViaKeyboard(){
        Keyboard keyboard = new Keyboard("Epson");
        computer.setInputDevice(keyboard);
        assertEquals("click from Keyboard", computer.inputData());
    }

    @Test
    public void canGetDataStream(){
        assertEquals(null, computer.getDataStream());
    }

    @Test
    public void canSetDataStream(){
        computer.setDataStream("hello");
        assertEquals("hello", computer.getDataStream());
    }

    @Test
    public void canOutputDataStreamNull(){
        assertEquals("null is now on screen", computer.outputDataStream());
    }

    @Test
    public void canOutputDataStreammouse(){
        computer.setDataStream(computer.inputData());
        assertEquals("click from Mouse is now on screen", computer.outputDataStream());
    }

}
