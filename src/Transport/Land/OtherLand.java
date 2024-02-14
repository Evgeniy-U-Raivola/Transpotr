package Transport.Land;

import Transport.FyelType;

public class OtherLand extends LandTransport implements FyelType {

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

    @Override
    public void FyelType() {
        System.out.println("*   *   *   *   *   *   *   *   *   *");
        System.out.println("в основном альтернативные источники");
        System.out.println("*   *   *   *   *   *   *   *   *   *");
    }
}
