package Transport;

import Transport.Air.JetPlane;
import Transport.Air.OtherPlane;
import Transport.Land.Train.Train;

public class Main {
    public static void main(String[] args) {

 Train Lastochka=new Train();
 Lastochka.setName("Ласточка");
 Lastochka.setDeviceType("электропоезд");
 Lastochka.MaxSpeed();
 Lastochka.Info();
 Lastochka.setLocoOrMultiply("моторвагонный состав");
 Lastochka.Info();



    }
}