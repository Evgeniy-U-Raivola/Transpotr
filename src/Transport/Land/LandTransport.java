package Transport.Land;
import Transport.Transport;

public abstract class LandTransport extends Transport {

//    конструкторы
    public LandTransport(){super();}
    public LandTransport(String name, String deviceType) {
        super (name, deviceType);}

//    методы
    public void MaxSpeed(){
        System.out.print("Максимальная скорость -   "); }

}
