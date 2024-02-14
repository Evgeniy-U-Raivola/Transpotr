package Transport.Water;

public class CargoShip extends WaterTransport{

    //     конструкторы
    public  CargoShip(){super();}
    public CargoShip(String name, String deviceType) {
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
        System.out.print(" 30-60  для крупных судов");   }
}
