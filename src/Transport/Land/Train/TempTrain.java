package Transport.Land.Train;
import Transport.Transport;

public abstract class TempTrain extends Transport {

    private String locoOrMultiply;
    { locoOrMultiply="Необходимо уточнение: моторвагонный состав, или локомотив! "; }
//   getters   +   setters
    public void setLocoOrMultiply(String locoOrMultiply) {
        this.locoOrMultiply = locoOrMultiply; }

    public String getLocoOrMultiply() {
        return locoOrMultiply;  }

    // конструкторы
    public TempTrain (){super(); }

    public TempTrain (String name,String deviceType) {
        super(name, deviceType); }

//   методы

    @Override
    public void Info() {  }

    public void MaxSpeed(){
    System.out.print("Максимальная скорость состава -   "); }
}
