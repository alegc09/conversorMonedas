import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaApi consultaApi = new ConsultaApi();
        int opc = 0;
        float monto;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("************************************");
            System.out.println("Bienvenido al conversor de Monedas");
            System.out.println("Elige una opción: ");
            System.out.println("1) Peso Mexicano >>> Yen Japones");
            System.out.println("2) Yen Japones >>> Peso Mexicano");
            System.out.println("3) Peso Mexicano >>> Dólar Estadounidense");
            System.out.println("4) Dólar Estadounidense >>> Peso Mexicano");
            System.out.println("5) Peso Mexicano >>> Euro");
            System.out.println("6) Euro >>> Peso Mexicano");
            System.out.println("7) Salir");
            System.out.println("************************************");
            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingresa la cantidad a converir: ");
                    monto = entrada.nextFloat();
                    Conversion conversion1 = consultaApi.conversion("MXN", "JPY", monto);
                    System.out.println(conversion1);
                    break;
                case 2:
                    System.out.println("Ingresa la cantidad a converir: ");
                    monto = entrada.nextFloat();
                    Conversion conversion2 = consultaApi.conversion("JPY", "MXN", monto);
                    System.out.println(conversion2);
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad a converir: ");
                    monto = entrada.nextFloat();
                    Conversion conversion3 = consultaApi.conversion("MXN", "USD", monto);
                    System.out.println(conversion3);
                    break;
                case 4:
                    System.out.println("Ingresa la cantidad a converir: ");
                    monto = entrada.nextFloat();
                    Conversion conversion4 = consultaApi.conversion("USD", "MXN", monto);
                    System.out.println(conversion4);
                    break;
                case 5:
                    System.out.println("Ingresa la cantidad a converir: ");
                    monto = entrada.nextFloat();
                    Conversion conversion5 = consultaApi.conversion("MXN", "EUR", monto);
                    System.out.println(conversion5);
                    break;
                case 6:
                    System.out.println("Ingresa la cantidad a converir: ");
                    monto = entrada.nextFloat();
                    Conversion conversion6 = consultaApi.conversion("EUR", "MXN", monto);
                    System.out.println(conversion6);
                    break;
                case 7:
                    System.out.println("Nos vemos!");
                    break;
                default:
                    System.out.println("Por favor ingrese una opción valida");
            }
        } while (opc != 7);
    }
}
