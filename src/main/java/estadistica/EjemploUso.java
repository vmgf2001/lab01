package estadistica;

import java.util.Random;
import estadistica.Estadistica;

public class EjemploUso {
    public static void main(String [] args) {
        Estadistica est = new Estadistica();
        Random ran = new Random();
        for (int i = 0; i < 100000 ; i++) {
            est.agrega(ran.nextGaussian());
        }
        System.out.println("Media = "+est.media());
        System.out.println("Desviacion tipica = "+est.desviacionTipica());
    }
}



class Prueba {
    public static void main(String[] args) {
        Random ran = new Random();
        Estadistica est = new Estadistica();
        est.agrega(ran.nextGaussian());
        System.out.println("Media = "+est.media());
        System.out.println("Desviacion tipica = "+est.desviacionTipica());
        System.out.println(2*2);
    }
}