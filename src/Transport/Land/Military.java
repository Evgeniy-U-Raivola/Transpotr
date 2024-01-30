package Transport.Land;

public class Military extends LandTransport{

    //     конструкторы
    public Military(){super();}
    public Military(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);}

//     методы

    @Override
    public void Info() {
        System.out.println("Объект военной техники: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("точные значения обычно засекречены");  }
}
