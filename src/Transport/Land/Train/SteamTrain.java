package Transport.Land.Train;

import Transport.FyelType;

public class SteamTrain extends TempTrain implements FyelType {

    //       конструкторы
    public SteamTrain(){super();}

    public SteamTrain( String name, String deviceType){
        this.setName(name);
        this.setDeviceType(deviceType);  }

//        методы


    @Override
    public void Info() {
        super.Info();
        System.out.println("Объект транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "вид подвижного состава : " + getLocoOrMultiply()+" \n"+
                "--    --    --    --    --    --    --    --    --    --    --");  }
    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("до 90 км/ч");  }

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("уголь");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
