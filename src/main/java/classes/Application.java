package classes;

public class Application {
    private DeviceManufacturers deviceManufacturers;
    private General general;
    private Manufacturers manufacturers;
    private InitialReporter initialReporter;
    private Device device;

    public DeviceManufacturers getDeviceManufacturers(){
        return deviceManufacturers;
    }

    public void setDeviceManufacturers(DeviceManufacturers deviceManufacturers) {
        this.deviceManufacturers = deviceManufacturers;
    }

    public General getGeneral(){
        return general;
    }

    public void setGeneral(General general){
        this.general = general;
    }

    public Manufacturers getManufacturers(){
        return manufacturers;
    }

    public void setManufacturers(Manufacturers manufacturers){
        this.manufacturers = manufacturers;
    }

    public InitialReporter getInitialReporter(){
        return initialReporter;
    }

    public void setInitialReporter(InitialReporter initialReporter){
        this.initialReporter = initialReporter;
    }

    public Device getDevice(){
        return device;
    }

    public void setDevice(Device device){
        this.device = device;
    }

}
