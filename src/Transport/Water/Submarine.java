package Transport.Water;

public class Submarine extends WaterTransport{

    //     конструкторы
    public  Submarine(){super();}

    public Submarine(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);   }

//     методы


    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }

    @Override
    public void SwimmingAutonomy() {
        super.SwimmingAutonomy();
        System.out.print(" до 180 , для атомных теоретически неограниченная"); }
}
