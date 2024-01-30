package Transport.Land;

public class SpecialEquipment extends LandTransport{

    //     конструкторы
    public SpecialEquipment(){super();}
    public SpecialEquipment(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);}

//     методы

    @Override
    public void Info() {
        System.out.println("Объект спецтехники: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("до 110 км/ч"); }
}
