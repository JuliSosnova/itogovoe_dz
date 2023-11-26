
/**Данный класс создает тип данных из seller_id и price
 * для дальнейшего использования при вычислении наименьшей стоимости и продавца
 * применяется в 1 задании
 * */
public class Mapmap  {
    String seller_id;
    double price;
    public Mapmap(String seller_id, double price){
        this.seller_id=seller_id;
        this.price=price;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Продавец: " + seller_id + ", цена=" + price ;
    }
}
