package Transport.Air;

public class JetPlane extends AirTransport{

//  конструкторы
     public JetPlane(){super();}

    public  JetPlane(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);}
// методы

    @Override
    public void Info() {
         System.out.println("Объект транспорта:"+getName()+", \n"+
                 "тип - "+ getDeviceType()+"\n"+
                 "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void FlyHeight() {
        super.FlyHeight();
        System.out.println(" 5 - 11 км.");
    }
}
