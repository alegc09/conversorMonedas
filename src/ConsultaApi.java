import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    Gson gson = new GsonBuilder().create();

    public Conversion conversion(String base, String target, float monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/37c1d308fa8cb3ff68670ddf/pair/" + base + "/" + target + "/" + monto);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            //JSON al Record
            ConversionApi conversionApi = gson.fromJson(json, ConversionApi.class);

            return new Conversion(conversionApi, monto);

        } catch (Exception e) {
            throw new RuntimeException("La conversión no se ha realizado: " + e.getMessage());
        }
    }
}