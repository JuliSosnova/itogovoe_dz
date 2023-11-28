import com.google.gson.Gson;
import model.Products;
import model.Avilability;
import model.Sellers;
import model.Sales;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**данный класс читает входные json файлы и преобразует их в массивы
 * */
public class JsonReader {
    private Gson gson;

    public JsonReader() {
        gson = new Gson();
    }

    public Products[] readProducts(String filename) throws IOException {
        String json = Files.readString(Paths.get(filename));
        Products[] products = gson.fromJson(json, Products[].class);
        return products;
    }

    public Avilability[] readAvailability(String filename) throws IOException {
        String json = Files.readString(Paths.get(filename));
        Avilability[] av = gson.fromJson(json, Avilability[].class);
        return av;
    }
    public Sellers[] readSellers(String filename) throws IOException {
        String json = Files.readString(Paths.get(filename));
        Sellers[] s = gson.fromJson(json, Sellers[].class);
        return s;
    }
    public Sales[] readSales(String filename) throws IOException {
        String json = Files.readString(Paths.get(filename));
        Sales[] s = gson.fromJson(json, Sales[].class);
        return s;
    }
}