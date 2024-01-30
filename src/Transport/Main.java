package Transport;

import Transport.Air.JetPlane;

public class Main {
    public static void main(String[] args) {

        JetPlane TU144 = new JetPlane("TU144","Турбореактивный пассажирский самолёт");
        TU144.Info();
        TU144.FlyHeight();
    }
}