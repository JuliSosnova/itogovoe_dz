/**задание 1 вариант 1 форматы файлов 3*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

import model.Avilability;
import model.Products;
import model.Sellers;
/**Для каждого товара вывести в файл продавца, у которого наименьшая цена на этот товар, и саму цену на этот товар у этого продавца*/
public class Main {
    public static void main(String[] args) throws IOException {
        JsonReader dataReader = new JsonReader();
        Map<Integer,String> products=new HashMap<>();
        Products[] pr;
        pr= dataReader.readProducts("./src/data/products.json");
        for (Products p: pr) {
            products.put(p.getProductId(),p.getProductName());
        }
        Map<Integer,String> seller=new HashMap<>();
        Sellers[] s;
        s= dataReader.readSellers("./src/data/sellers.json");
        for (Sellers sl: s) {
            seller.put(sl.getSellerId(),sl.getFirstName()+" "+sl.getLastName());
        }
        Avilability[] a;
        a = dataReader.readAvailability("./src/data/product_availability.json");
        Map<String, Mapmap> product_map = new HashMap<>();
        for (Avilability p: a) {
            String key=products.get(p.getProductId());
            if(product_map.containsKey(key)){
                Mapmap t=product_map.get(key);
                if(t.getPrice()>p.getPrice()){
                    Mapmap t2=new Mapmap(seller.get(p.getSellerId()),p.getPrice());
                    product_map.put(key,t2);
                }
            }
            else{
                Mapmap t=new Mapmap(seller.get(p.getSellerId()),p.getPrice());
                product_map.put(key,t);
            }
        }
        product_map.forEach((key, value) -> System.out.println("наименование: "+key + " " + value));
        record(product_map);
    }
    public  static void record(Map mapname){
        Gson gson = new Gson();
        try {
            String json = gson.toJson(mapname);
            FileWriter fileWriter = new FileWriter("JsonFile.json");
            fileWriter.write(json);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
