import java.util.concurrent.TimeUnit;

import static java.lang.Math.pow;

public class StopThread {
    public static void main(String[] args) {
     double earthWeight = 5.972 * pow(10,24);
     double mass = earthWeight/Planet.EARTH.getGravitySurface();
     for(Planet p:Planet.values()){
         System.out.println(p+" "+p.surfaceWeight(mass));
     }
    }
   // public static final int STYLE_BOLE = 1 << 0;
}