package Transport.Air;

public class Bomber extends AirTransport {

//  конструкторы
    public Bomber(){super();}
    public Bomber(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);  }

//   методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта:"+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void FlyHeight() {
        super.FlyHeight();
        System.out.println(" 0,5  -- 16  км\n");
    }
}
