package Transport.Land.Train;

public class FreightTrain extends TempTrain{

//       конструкторы
    public FreightTrain(){super();}
    public FreightTrain( String name, String deviceType){
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
        System.out.println("до 80 км/ч"); }
}
