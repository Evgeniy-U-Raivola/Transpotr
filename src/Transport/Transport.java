package Transport;

public abstract class Transport {

    private String name;
    private String deviceType;
    {name="абстрактный транспорт"; }
// конструкторы
    public Transport() {};
    public Transport(String name,String deviceType){
        this.name=name;
        this.deviceType=deviceType; }
//   setters + getters
    public String getName() {
        return name; }
    public void setName(String name) {
        this.name=name; }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    //   методы
    public abstract void Info();
}
