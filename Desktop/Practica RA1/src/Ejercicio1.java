import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        float C1, C2, C3, C4, S, P;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la nota C1: ");
        C1 = leer.nextFloat();
        System.out.print("Introduce la nota C2: ");
        C2 = leer.nextFloat();
        System.out.print("Introduce la nota C3: ");
        C3 = leer.nextFloat();
        System.out.print("Introduce la nota C4: ");
        C4 = leer.nextFloat();
        S = C1 + C2 + C3 + C4;
        P = S/4;
        System.out.printf("La nota media es de: %.2f ", + P);
    }
}
//Hola que tal soy Luisella 