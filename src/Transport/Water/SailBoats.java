package Transport.Water;

import Transport.FyelType;
import Transport.PublicTransport;

public class SailBoats extends WaterTransport implements PublicTransport, FyelType {

    //     конструкторы
    public  SailBoats(){super();}

    public SailBoats(String name, String deviceType) {
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
        System.out.print(" от 1 до 120, в зависимости от водоизмещения ");
    }

    @Override
    public void PublicTransport() {
        System.out.println("крупные парусники могут использовться для перевозки пассажиров или круизов");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("сила верта, солярка для вспомогательных двигателей");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
