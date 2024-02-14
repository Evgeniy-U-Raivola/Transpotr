package Transport.Water;

public class Icebreaker extends WaterTransport{

    //     конструкторы
    public  Icebreaker(){super();}

    public Icebreaker(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);   }

//     методы


    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void SwimmingAutonomy() {
        super.SwimmingAutonomy();
        System.out.print(" до 365 , для атомных ледоколов  теоретически неограниченная");
    }
}
