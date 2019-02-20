package device_management;

public abstract class InputDevice {

    private String brand;

    public InputDevice(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
