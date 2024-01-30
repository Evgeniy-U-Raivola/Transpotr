package Transport.Land;

public class Car extends LandTransport{

//    конструкторы
    public Car(){super();}
    public Car (String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType); }

//     методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("как правило, ограничена 250 км/ч, спортивные модификации до 350 км/ч"); }
}
