package matricesdispersas;
import java.util.Scanner;

public class MenuMatrices {

    Scanner scanner = new Scanner(System.in);
    int[][] Matriz = null;
    int opcion, filas, columnas;

    public void MosrarMenu(){
        do{
            System.out.println("\n--- MENÚ DE OPERACIONES CON POLINOMIOS ---");
            System.out.println("1. Crear Matriz");
            System.out.println("2. Salir");
            System.out.print("--> Digite una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de filas de la matriz: ");
                    filas = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de columnas de la matriz: ");
                    columnas = scanner.nextInt();
                    System.out.println(filas);
                    System.out.println(columnas);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                break;
            }
        }while(opcion!=2);
        scanner.close();
    }
}
