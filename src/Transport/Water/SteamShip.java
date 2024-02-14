package Transport.Water;

import Transport.FyelType;
import Transport.PublicTransport;

public class SteamShip extends WaterTransport implements PublicTransport, FyelType {

    //     конструкторы
    public  SteamShip(){super();}

    public SteamShip(String name, String deviceType) {
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
        System.out.println("до  20-30 на крупном судне, зависит от веса загружаемого топлива."); }

    @Override
    public void PublicTransport() {
        System.out.println("Иногда некоторые пароходы используются в туристических целях");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("уголь");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
