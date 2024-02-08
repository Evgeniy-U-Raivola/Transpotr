package Transport.Land;

public class TrolleyBus extends LandTransport{

    //     конструкторы
    public  TrolleyBus(){super(); }

    public TrolleyBus(String name, String deviceType) {
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
        System.out.println("городские 60-75 км/ч");
    }
}
