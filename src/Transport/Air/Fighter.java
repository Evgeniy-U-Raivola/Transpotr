package Transport.Air;

public class Fighter extends AirTransport{

//   конструкторы
     public Fighter(){super();}
     public Fighter(String name, String deviceType) {
         this.setName(name);
         this.setDeviceType(deviceType); }
//    методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта:"+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void FlyHeight() {
        super.FlyHeight();
        System.out.println("0,1 -- 22 км \n"); }
}
