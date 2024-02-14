package Transport.Land.Train;

import Transport.FyelType;
import Transport.PublicTransport;

public class Tram extends TempTrain implements PublicTransport , FyelType {

//       конструкторы
    public Tram (){super();}
    public Tram ( String name, String deviceType){
        this.setName(name);
        this.setDeviceType(deviceType);  }

//        методы

    @Override
    public void Info() {
        super.Info();
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "вид подвижного состава : " + getLocoOrMultiply()+" \n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("до 60 км/ч в зависимости от инфраструктуры н/п"); }

    @Override
    public void PublicTransport() {
        System.out.println("создан как электрическая модификация автобуса");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("электрический вид транспорта");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
