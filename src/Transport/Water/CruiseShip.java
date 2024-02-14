package Transport.Water;

public class CruiseShip extends WaterTransport{

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
}
