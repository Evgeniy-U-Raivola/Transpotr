package Transport.Land;

import Transport.FyelType;
import Transport.PublicTransport;

public class Bus extends LandTransport implements PublicTransport, FyelType {

//     конструкторы
    public  Bus(){super();}
    public Bus(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);   }

//     методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("городские 80км/ч, междугородние до 130 км/ч");  }

    @Override
    public void PublicTransport() {
        System.out.println("созданы исключительно для перевозки пассажиров");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("солярка, природный газ, электрические батареи");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
