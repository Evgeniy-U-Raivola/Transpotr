package Transport.Air;

import Transport.FyelType;
import Transport.MilitaryUse;

public class Bomber extends AirTransport implements MilitaryUse, FyelType {

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
        System.out.println(" 0,5  -- 16  км\n");  }

    @Override
    public void MilitaryObject() {
        System.out.println("используется исключительно в военных целях"); }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("авиационный керосин");
        System.out.println("*   *   *   *   *   *   *   *   *   *"); }
}
