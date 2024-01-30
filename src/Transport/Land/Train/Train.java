package Transport.Land.Train;

public class Train extends TempTrain {

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
}
