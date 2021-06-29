public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return getRingTone();
        // your code here
    }
    @Override
    public String unlock() {
        return "unlocking via facial recognition";
        // your code here
    }
    @Override
    public void displayInfo() {
        System.out.printf("version %s\n", getVersion());
        System.out.printf("Battey Status at %d\n", getBatteryPercentage());
        System.out.printf("Carrier is %s\n", getCarrier());
        System.out.printf("Ring Tone Setting is %s\n", getRingTone());
        // your code here            
    }
}