package Transport.Air;

import Transport.Transport;

public abstract class AirTransport extends Transport {

//   конструкторы
     public AirTransport(){super(); }

      public AirTransport(String name,String deviceType) {
          super(name, deviceType); }
//  методы
     public void FlyHeight() {
           System.out.print("Высота полёта -   ");
     }


}
