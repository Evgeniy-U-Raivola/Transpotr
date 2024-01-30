package Transport.Land;

public class TrackedVehicles extends LandTransport{

//     конструкторы
        public TrackedVehicles(){super();}
        public TrackedVehicles(String name, String deviceType) {
            this.setName(name);
            this.setDeviceType(deviceType);}

//     методы

    @Override
    public void Info() {
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("обычно не более 60-80 км/ч");  }
}
