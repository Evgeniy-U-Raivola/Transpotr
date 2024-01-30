package Transport.Air;

public class Helicopter extends AirTransport{

//  конструкторы
     public Helicopter(){super();}
     public Helicopter(String name, String deviceType) {
         this.setName(name);
         this.setDeviceType(deviceType); }

    @Override
    public void Info() {
        System.out.println("Объект транспорта:"+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void FlyHeight() {
        super.FlyHeight();
        System.out.println(" 0,1 - 3,5 км\n");
    }
}
