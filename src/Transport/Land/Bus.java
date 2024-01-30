package Transport.Land;

public class Bus extends LandTransport{

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
}
