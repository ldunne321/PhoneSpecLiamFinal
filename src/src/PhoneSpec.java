/**
 * Created by Liam on 17/11/2016.
 */
public class PhoneSpec {


    private String brand;
    private String model;
    private int memory;
    private String network;
    private boolean camera;

    public PhoneSpec(String brand, String model, int memory, String network, boolean camera){

        this.brand=brand;
        this.model=model;
        this.memory=memory;
        this.network=network;
        this.camera=camera;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }






}
