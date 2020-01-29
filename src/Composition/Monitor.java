package Composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;

//    resolution class is part of a monitor, monitor isnt a resolution, but it has a resolution
//    saying that resolution is a component of a monitor and monitor has a resolution
    private Resolution nativeResolution; //Resolution is going to be a class //this is using composition

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String colour){
        System.out.println("drawing pixel at " + x + "," + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
