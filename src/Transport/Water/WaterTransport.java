package Transport.Water;

import Transport.Transport;

public abstract class WaterTransport extends Transport {

    //    конструкторы
    public WaterTransport(){super();}
    public WaterTransport(String name, String deviceType) {
        super (name, deviceType);}

//    методы
    public void SwimmingAutonomy() {
        System.out.print("АВтономность (в сутках)  -   ");
    }
}
