package device_management;

import behaviours.IInput;

public class Mouse extends InputDevice implements IInput {

    public Mouse(String type) {
        super(type);
    }

    public String click(){
        return "Click";
    }

    public String sendData(){
        return "click from Mouse";
    }

}
