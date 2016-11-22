import javafx.scene.Camera;

/**
 * Created by Liam on 17/11/2016.
 */
public abstract class PhoneSpec {



    public String brand;
    final Model model;
    final Memory memory;
    final Network network;
    final Camera camera;

    public PhoneSpec(){


    }

    public PhoneSpec(Brand brand, Model model, Memory memory, Network network, Camera camera) {

        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.network = network;
        this.camera = camera;
    }

    public Brand getBrand() {
        return brand;
    }



    public Model getModel() {
        return model;
    }



    public Memory getMemory() {
        return memory;
    }



    public Network getNetwork() {
        return network;
    }



    public Camera isCamera() {
        return camera;
    }




    public boolean matches(PhoneSpec otherPhone) {
        if (isSpecified(otherPhone.getBrand())) {
            return this.brand == otherPhone.getBrand();
        }

        if (isPhoneSpecified(otherPhone)) {
            return this.model==(otherPhone.getModel());
        }

        if (isSpecified(otherPhone.getNetwork())) {
            return this.network == (otherPhone.getNetwork());
        }

        if (isSpecified(otherPhone.getMemory())) {
            return this.memory == otherPhone.getMemory();
        }

        if (isSpecified(otherPhone.getCamera())) {
            return this.camera == otherPhone.getTopWood();
        }
        return true;
    }



    private boolean isSpecified(Object field) {
        return field != null;
    }



    private boolean isPhoneSpecified(PhoneSpec otherPhone) {
        return (otherPhone.getModel() != null)
                && (!otherPhone.getModel().equals(""));
    }

}

