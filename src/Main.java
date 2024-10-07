import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion;

        do{
            System.out.println("""
                    *********************************************
                    Bienvenido(a) al conversor de monedas
                    
                    1) Colones costarricenses ->> Dólar
                    2) Dólar ->> Colones costarricenses
                    3) Colones costarricenses ->> Peso mexicano
                    4) Peso mexicano ->> Colones costarricenses
                    5) Colones costarricenses ->> Euros
                    6) Euros ->> Colones costarricenses
                    7) Salir
                    
                    *********************************************
                    """);


            System.out.print("Digita tu opción --> ");
            opcion = entrada.nextLine();
            SubMenu subMenu = new SubMenu();

            switch (opcion){
                case "1" -> subMenu.obtenerMonto("CRC", "USD");
                case "2" -> subMenu.obtenerMonto("USD", "CRC");
                case "3" -> subMenu.obtenerMonto("CRC", "MXN");
                case "4" -> subMenu.obtenerMonto("MXN", "CRC");
                case "5" -> subMenu.obtenerMonto("CRC", "EUR");
                case "6" -> subMenu.obtenerMonto("EUR", "CRC");
                case "7" -> System.out.println("Finalizando programa...");
                default ->
                    System.out.println("\nOpción inválida. Intemte de nuevo. \n");
            }

        }while(!opcion.equals("7"));

    }
}
