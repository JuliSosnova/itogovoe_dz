import com.google.gson.Gson;
import model.Sales;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/** Вывести в файл топ 5 дат, в которые было продано наибольшее количество товаров
 * результат записывается в json*/

public class Main2 {
    public static void main(String[] args) throws IOException {
        JsonReader dataReader = new JsonReader();
        Sales[] s;
        s= dataReader.readSales("./src/data/sales.json");
        Map<String,Integer> cnt=new HashMap<>();
        for (Sales d:s ){
            String key=d.getSaleDate() ;
            if(cnt.containsKey(key)){
                cnt.put(key,cnt.get(key)+d.getNum());
            }
            else{
                cnt.put(key,d.getNum());
            }
        }
        Comparator<String> valueComparator = (c1, c2) ->cnt.get(c2).compareTo(cnt.get(c1));
        TreeMap<String, Integer> sortedtable = new TreeMap<>(valueComparator);//создает новый словарь отсортированый по созданному компаратору
        sortedtable.putAll(cnt);
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            count++;
            if (count == 5) {
                break;
            }
        }
        record(sortedtable);
    }
    public  static void record(Map mapname){
        Gson gson = new Gson();
        try {
            String json = gson.toJson(mapname);
            FileWriter fileWriter = new FileWriter("JsonFile2.json");
            fileWriter.write(json);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
