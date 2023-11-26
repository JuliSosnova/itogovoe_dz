package model;
/**Данный является моделью для файла products_availability.json
 * */
public class Avilability {
    private int sellerId;
    private int productId;
    private double price;
    private int available;

    public Avilability(int sellerId, int productId, double price, int available) {
        this.sellerId=sellerId;
        this.productId=productId;
        this.price=price;
        this.available=available;
    }


    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "avilability{" +
                "sellerId='" + sellerId + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
