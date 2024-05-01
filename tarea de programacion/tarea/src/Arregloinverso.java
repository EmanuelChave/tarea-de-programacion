import java.util.Scanner;

public class Arregloinverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo (entre 2 y 16): ");
        int tamano = scanner.nextInt();

        // Validar el tamaño del arreglo
        if (tamano < 2 || tamano > 16) {
            System.out.println("El tamaño del arreglo debe estar entre 2 y 16.");
            return;
        }

        // Crear el arreglo
        int[] arreglo = new int[tamano];

        // Solicitar al usuario los valores para el arreglo
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Invertir los datos del arreglo
        for (int i = 0; i < tamano / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[tamano - 1 - i];
            arreglo[tamano - 1 - i] = temp;
        }

        // Mostrar el arreglo invertido
        System.out.println("Arreglo invertido:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
    }
}
