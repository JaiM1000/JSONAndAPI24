import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.text.ParseException;

public class E_Poke_API {

    // Method to pull data from the API and print Charizard's weight
    public void pull() throws ParseException {
        try {
            String apiUrl = "https://pokeapi.co/api/v2/pokemon/charizard";

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder(); // AI reminded me to use this line
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            JSONObject jsonResponse = new JSONObject(response.toString()); // AI reminded me to use this line

            int weight = jsonResponse.getInt("weight");
            System.out.println("Charizard's Weight: " + weight);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParseException {
        E_Poke_API api = new E_Poke_API();
        api.pull();
    }
}
