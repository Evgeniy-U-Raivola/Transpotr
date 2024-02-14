package Transport.Land;

import Transport.FyelType;
import Transport.PublicTransport;

public class Car extends LandTransport implements PublicTransport, FyelType {

//    конструкторы
    public Car(){super();}
    public Car (String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType); }

//     методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("как правило, ограничена 250 км/ч, спортивные модификации до 350 км/ч"); }

    @Override
    public void PublicTransport() {
        System.out.println("легковые машины созданы для перевозки пассажиров");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("бензин,солярка, электрические батареи");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
