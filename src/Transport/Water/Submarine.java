package Transport.Water;

import Transport.FyelType;
import Transport.MilitaryUse;

public class Submarine extends WaterTransport implements MilitaryUse, FyelType {

    //     конструкторы
    public  Submarine(){super();}

    public Submarine(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);   }

//     методы


    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void SwimmingAutonomy() {
        super.SwimmingAutonomy();
        System.out.print(" до 180 , для атомных теоретически неограниченная"); }

    @Override
    public void MilitaryObject() {
        System.out.println("в основном, подводные лодки строят для военных"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка, электрические батареи, атомная энергия");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
