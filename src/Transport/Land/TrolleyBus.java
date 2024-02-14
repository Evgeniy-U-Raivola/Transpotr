package Transport.Land;

import Transport.FyelType;
import Transport.PublicTransport;

public class TrolleyBus extends LandTransport implements PublicTransport, FyelType {

    //     конструкторы
    public  TrolleyBus(){super(); }

    public TrolleyBus(String name, String deviceType) {
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
        System.out.println("городские 60-75 км/ч");
    }

    @Override
    public void PublicTransport() {
        System.out.println("Электрический подвид автобусов для перевозки пассажиров");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("Электроэнергия");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
