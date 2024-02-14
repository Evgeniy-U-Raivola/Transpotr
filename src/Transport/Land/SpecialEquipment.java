package Transport.Land;

import Transport.FyelType;
import Transport.MilitaryUse;

public class SpecialEquipment extends LandTransport implements MilitaryUse, FyelType {

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

    @Override
    public void MilitaryObject() {
        System.out.println("спецтехника часто используется или создаётся для военных целей"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("как правило, солярка");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
