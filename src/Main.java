import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de filas y columnas
        int filas, columnas;
        do {
            System.out.print("Ingrese el número de filas (mayor o igual a 2): ");
            filas = scanner.nextInt();
        } while (filas < 2);

        do {
            System.out.print("Ingrese el número de columnas (mayor o igual a 2): ");
            columnas = scanner.nextInt();
        } while (columnas < 2);

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Cargar la matriz con valores ingresados por el usuario
        System.out.println("Ingrese los valores de la matriz:");
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }

        // Calcular el promedio entero
        int totalElementos = filas * columnas;
        int promedio = suma / totalElementos;
        System.out.println("El promedio entero de los elementos es: " + promedio);

        // Buscar si el promedio se encuentra en alguna celda de la matriz
        boolean encontrado = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == promedio) {
                    encontrado = true;
                    System.out.println("El promedio se encuentra en la posición: [" + i + "][" + j + "]");
                }
            }
        }

        // Mostrar mensaje si no se encontró el promedio
        if (!encontrado) {
            System.out.println("No se encontró ninguna coincidencia.");
        }

        scanner.close();
    }
}




