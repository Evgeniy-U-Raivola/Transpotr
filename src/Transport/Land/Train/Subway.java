package Transport.Land.Train;

import Transport.FyelType;
import Transport.PublicTransport;

public class Subway extends TempTrain implements PublicTransport, FyelType {

//       конструкторы
    public Subway (){super();}
    public Subway ( String name, String deviceType){
        this.setName(name);
        this.setDeviceType(deviceType);  }

//        методы
    @Override
    public void Info() {
    super.Info();
    System.out.println("Объект подземного транспорта: "+getName()+", \n"+
            "тип - "+ getDeviceType()+"\n"+
            "вид подвижного состава : " + getLocoOrMultiply()+" \n"+
            "--    --    --    --    --    --    --    --    --    --    --");   }
    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("до 90 км/ч на горизонтальных участках трубы"); }

    @Override
    public void PublicTransport() {
        System.out.println("метро создано для перевозки огромных пассажиропотоков");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("электричекий вид транспорта");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
