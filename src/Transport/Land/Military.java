package Transport.Land;

import Transport.FyelType;
import Transport.MilitaryUse;

public class Military extends LandTransport implements MilitaryUse, FyelType {

    //     конструкторы
    public Military(){super();}
    public Military(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);}

//     методы

    @Override
    public void Info() {
        System.out.println("Объект военной техники: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("точные значения обычно засекречены");  }

    @Override
    public void MilitaryObject() {
        System.out.println("этот класс содержит исключительно военные военные  наземные транспортные средства"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка, спецтопливо");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
