import javafx.scene.Camera;

/**
 * Created by Liam on 17/11/2016.
 */
public  class PhoneSpec {


    private Model model;
    private Memory memory;
    private Network network;







    public PhoneSpec() {
    }

    public PhoneSpec(Model model, Memory memory, Network network) {


        this.model = model;
        this.memory = memory;
        this.network = network;


    }


    public Model getModel() {
        return model;
    }

public Model setModel(Model model){


    this.model=model;
    return  model;
}
    public Network setNetwork(Network network){

        this.network=network;
        return network;
    }


    public Memory setMemory(Memory memory){

        this.memory=memory;
        return memory;
    }

    public Memory getMemory() {
        return memory;
    }


    public Network getNetwork() {
        return network;
    }


    public boolean matches(PhoneSpec otherPhone) {
        if (isPhoneSpecified(otherPhone)) {
            return this.model == (otherPhone.getModel());
        }

        if (isSpecified(otherPhone.getNetwork())) {
            return this.network == (otherPhone.getNetwork());
        }

        if (isSpecified(otherPhone.getMemory())) {
            return this.memory == otherPhone.getMemory();
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

