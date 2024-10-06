import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetCurrencyConverted {
    public Currency obtenerTipoDeCambio(String base_currency, String target_currency,
                                        double amount){
        String direccion = "https://v6.exchangerate-api.com/v6/e9e969fb697ddd116f1c27d8/pair/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion + base_currency + "/" + target_currency +
                        "/" + amount))
                .build();
        try{
            HttpResponse <String >response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);

        }catch(Exception e){
            throw new RuntimeException("Error al convertir la moneda.");
        }
    }
}
