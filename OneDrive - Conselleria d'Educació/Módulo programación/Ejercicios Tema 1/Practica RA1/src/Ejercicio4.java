import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] asrg){
        Scanner leer = new Scanner(System.in);
        int H, A, C,TPH, TPA, TPC, TP;
        int PH = 6;
        int PA = 8;
        int PC = 14;
        System.out.print("Introduce el número de hormigas: ");
        H = leer.nextInt();
        System.out.print("Introduce el número de Arañas: ");
        A = leer.nextInt();
        System.out.print("Introduce el número de Cochinillas: ");
        C = leer.nextInt();
        TPH = PH * H;
        TPA = PA * A;
        TPC = PC * C;
        TP = TPH + TPA + TPC;
        System.out.print("Total de patas es: " + TP);



    }
}
