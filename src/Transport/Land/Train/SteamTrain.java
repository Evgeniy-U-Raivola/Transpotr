package Transport.Land.Train;

public class SteamTrain extends TempTrain{

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
}
