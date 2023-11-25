import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float mm, cm, m, pamm, pamm2, DT, DTC;
        System.out.print("Introduce la primera distancia en mm ");
        mm = leer.nextFloat();
        System.out.print("Introduce la segunda distancia en cm ");
        cm = leer.nextFloat();
        System.out.print("Introduce la tercera distancia en m ");
        m = leer.nextFloat();
        pamm = cm * 10;
        pamm2 = m * 1000;
        DT = pamm + pamm2 + mm;
        DTC = DT/10;
        System.out.print("La distancia total en cm es: " + DTC);


    }

}

