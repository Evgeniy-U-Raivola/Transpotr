package Transport.Water;

import Transport.FyelType;
import Transport.MilitaryUse;

public class Icebreaker extends WaterTransport implements MilitaryUse, FyelType {

    //     конструкторы
    public  Icebreaker(){super();}

    public Icebreaker(String name, String deviceType) {
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
        System.out.print(" до 365 , для атомных ледоколов  теоретически неограниченная");
    }

    @Override
    public void MilitaryObject() {
        System.out.println("d ХХI веке появиись военные модификалии ледоколов"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка, атомная энергия");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
