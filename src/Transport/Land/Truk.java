package Transport.Land;

public class Truk extends LandTransport{

//    конструкторы
    public Truk(){super(); }
    public Truk (String name, String deviseType) {
        this.setName(name);
        this.setDeviceType(deviseType);  }
//    методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("до 120 км/ч"); }
}
