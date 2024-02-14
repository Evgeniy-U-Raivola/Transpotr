package Transport.Air;

import Transport.FyelType;
import Transport.MilitaryUse;
import Transport.PublicTransport;

public class Helicopter extends AirTransport implements MilitaryUse, PublicTransport, FyelType {

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
        System.out.println(" 0,1 - 3,5 км\n"); }
    @Override
    public void MilitaryObject() {
        System.out.println("есть военные и гражданские модификации вертолётов");  }

    @Override
    public void PublicTransport() {
        System.out.println("есть вертолёты для перевозки пассажиров");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("авиационный керосин");
        System.out.println("*   *   *   *   *   *   *   *   *   *"); }
}
