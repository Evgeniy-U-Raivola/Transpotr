package Transport.Water;

public class SteamShip extends WaterTransport{

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
}
