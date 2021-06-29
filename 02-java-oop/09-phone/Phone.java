public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
    public String getVersion(){
        return this.versionNumber;
    }

    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }

    public String getCarrier(){
        return this.carrier;
    }

    public String getRingTone(){
        return this.ringTone;
    }

    public void setVersionNum(String version){
        this.versionNumber = version;
    }
    public void setBatteryPercentage(int battery){
        this.batteryPercentage = battery;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setRingTone(String ringTone){
        this.ringTone = ringTone;
    }
}