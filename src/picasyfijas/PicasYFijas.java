package picasyfijas;

import java.util.Scanner;

public class PicasYFijas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[] = {5, 4, 6, 2};
        int numeroDado[] = new int[4];
        int picas = 0;
        int fijas = 0;
        boolean victory = false;
        while (victory == false) {

            System.out.println("Ingrese Cuatro Numeros, Cada uno Separado Por un Espacio.");
            System.out.println("Recuerde que cada numero debe ir del Uno al Diez.");
            for (int i = 0; i < numeroDado.length; i++) {
                numeroDado[i] = sc.nextInt();
            }

            if (numeroDado[0] == numero[0]) {
                fijas++;

            }

            if (numeroDado[1] == numero[1]) {
                fijas++;

            }

            if (numeroDado[2] == numero[2]) {
                fijas++;

            }
            if (numeroDado[3] == numero[3]) {
                fijas++;

            }
            if (numeroDado[0] == numero[1] || numeroDado[0] == numero[2] || numeroDado[0] == numero[3]) {
                picas++;
            }
            if (numeroDado[1] == numero[0] || numeroDado[1] == numero[2] || numeroDado[1] == numero[3]) {
                picas++;
            }
            if (numeroDado[2] == numero[0] || numeroDado[2] == numero[1] || numeroDado[2] == numero[3]) {
                picas++;
            }
            if (numeroDado[3] == numero[0] || numeroDado[3] == numero[1] || numeroDado[3] == numero[2]) {
                picas++;
            }
            System.out.println("Numero de Picas = " + picas);
            System.out.println("Numero de Fijas = " + fijas);
            if (fijas == 4) {
                victory = true;
                System.out.println("Ganaste");
            }
            picas = 0;
            fijas = 0;
        }

    }

}
