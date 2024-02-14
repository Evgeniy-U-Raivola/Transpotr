package Transport.Water;

import Transport.FyelType;
import Transport.PublicTransport;

public class CruiseShip extends WaterTransport implements PublicTransport, FyelType {

    //     конструкторы
    public  CruiseShip(){super();}

    public CruiseShip(String name, String deviceType) {
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
        System.out.print(" до 120, в зависимости от маршрута круиза ");
    }

    @Override
    public void PublicTransport() {
        System.out.println("созданы исключительно для перевозки пассажиров");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка");
        System.out.println("*   *   *   *   *   *   *   *   *   *"); }
}
