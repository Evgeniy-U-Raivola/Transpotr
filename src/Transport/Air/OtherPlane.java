package Transport.Air;

public class OtherPlane extends AirTransport{

//   конструкторы
     public OtherPlane(){super();}
     public OtherPlane(String name, String deviceType) {
         this.setName(name);
         this.setDeviceType(deviceType);  }

//    методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта:"+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void FlyHeight() {
        super.FlyHeight();
        System.out.println( "0,1  ---   один-два  км\n"); }
}
