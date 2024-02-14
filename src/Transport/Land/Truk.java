package Transport.Land;

import Transport.FyelType;
import Transport.MilitaryUse;

public class Truk extends LandTransport implements MilitaryUse, FyelType {

//    конструкторы
    public Truk(){super(); }
    public Truk (String name, String deviseType) {
        this.setName(name);
        this.setDeviceType(deviseType);  }
//    методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("до 120 км/ч"); }

    @Override
    public void MilitaryObject() {
        System.out.println("грузовики часто используются для военных целей"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
