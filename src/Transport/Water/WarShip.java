package Transport.Water;

public class WarShip extends WaterTransport{

    //     конструкторы
    public  WarShip(){super();}

    public WarShip(String name, String deviceType) {
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
        System.out.print(" обычно  7 - 90, у атомных кораблей теоретически неограниченная  ");
    }
}

