import java.util.Scanner;

public class SubMenu {

    public void obtenerMonto(String base_code, String target_code){
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite el monto que desea convertir: ");

        try {
            double monto = entrada.nextDouble();

            GetCurrencyConverted convertirMonto = new GetCurrencyConverted();
            Currency montoConvertido = convertirMonto.obtenerTipoDeCambio(base_code,
                    target_code, monto);

            System.out.println("\nEl valor " + monto +
                    " (" + base_code + ") corresponde al valor final" +
                    " de: " + montoConvertido.conversion_result() + " (" + target_code + ").\n");
        } catch (Exception e) {
            System.out.println("\nMonto inválido. Intenta de nuevo\n");;
        }


    }
}
