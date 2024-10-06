public class Main {
    public static void main(String[] args) {

        Object moneda = "23.5";

        if(!(moneda instanceof Double d)){
            System.out.println("Volver al menu");
        }else{
            System.out.println("convertir moneda");
        }
    }
}
