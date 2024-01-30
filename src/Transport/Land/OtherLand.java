package Transport.Land;

public class OtherLand extends LandTransport{

    //     конструкторы
    public OtherLand(){super();}
    public OtherLand(String name, String deviceType) {
        this.setName(name);
        this.setDeviceType(deviceType);}

//     методы

    @Override
    public void Info() {
        System.out.println("группа \"Альтернативный транспорт объединяет в себе\" \n "+
                " вело, гужевой, спортинвентарь(самокаты,скейтборды и т.п. фуникулёрный...\n");
        System.out.println("Объект альтернативного транспорта: "+getName()+", \n"+
                "тип - "+ getDeviceType()+"\n"+
                "--    --    --    --    --    --    --    --    --    --    --");   }

    @Override
    public void MaxSpeed() {
        super.MaxSpeed();
        System.out.println("Обычно, низкоскоростные, до 50  -- 60 км/ч");
    }
}
