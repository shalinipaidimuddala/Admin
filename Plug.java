class Plug {
    public void plugIn() {
        System.out.println("Plugged in");
    }
}

class Appliance {
    private Plug plug;

    public Appliance(Plug plug) {
        this.plug = plug;
    }

    public void use() {
        plug.plugIn();
    }
}

public class CouplingExample {
    public static void main(String[] args) {
        Plug plug = new Plug();
        Appliance appliance = new Appliance(plug);
        appliance.use();
    }
}