package Transport.Air;

public class Turboprop extends AirTransport{

    //  конструкторы
    public Turboprop(){super();}

    public  Turboprop(String name, String deviceType) {
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
       System.out.println(" 1 - 11 км.\n");
   }
}
