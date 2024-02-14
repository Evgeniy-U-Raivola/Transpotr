package Transport.Water;

public class SailBoats extends WaterTransport{

    //     конструкторы
    public  SailBoats(){super();}

    public SailBoats(String name, String deviceType) {
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
        System.out.print(" от 1 до 120, в зависимости от водоизмещения ");
    }
}
