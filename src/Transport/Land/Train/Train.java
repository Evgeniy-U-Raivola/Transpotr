package Transport.Land.Train;

import Transport.FyelType;
import Transport.PublicTransport;

public class Train extends TempTrain implements PublicTransport, FyelType {

//       конструкторы
    public Train(){super();}
    public Train( String name, String deviceType){
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
        System.out.println("120  --  160 км/ч, скоростные экспрессы  до 350 км/ч"); }

    @Override
    public void PublicTransport() {
        System.out.println("для перевозки людей используются пассажирские поезда и электрички");
    }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("локомотивное ДТ, электроэнергия, магнитное поле");
        System.out.println("*   *   *   *   *   *   *   *   *   *"); }
}
