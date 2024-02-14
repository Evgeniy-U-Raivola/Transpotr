package Transport.Water;

import Transport.FyelType;
import Transport.MilitaryUse;

public class WarShip extends WaterTransport implements MilitaryUse, FyelType {

    //     конструкторы
    public  WarShip(){super();}

    public WarShip(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);   }

//     методы


    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void SwimmingAutonomy() {
        super.SwimmingAutonomy();
        System.out.print(" обычно  7 - 90, у атомных кораблей теоретически неограниченная  ");
    }

    @Override
    public void MilitaryObject() {
        System.out.println("этот класс содержит исключительно военные корабли"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка, атомная энергия");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}

