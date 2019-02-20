package device_management;

import behaviours.IInput;

public class Keyboard extends InputDevice implements IInput {

    public Keyboard(String brand) {
        super(brand);
    }

    public String clickKey(){
        return "Click";
    }

    public String sendData(){
        return "click from Keyboard";
    }

}
