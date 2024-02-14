package Transport.Air;

import Transport.FyelType;
import Transport.MilitaryUse;
import Transport.PublicTransport;

public class Turboprop extends AirTransport implements MilitaryUse, PublicTransport, FyelType {

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

    @Override
    public void MilitaryObject() {
        System.out.println("есть военные и гражданские модификации самолётов"); }

    @Override
    public void PublicTransport() {
        System.out.println("пассажирские турбовинтовые самолёты");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("авиационный керосин");
        System.out.println("*   *   *   *   *   *   *   *   *   *"); }
}
