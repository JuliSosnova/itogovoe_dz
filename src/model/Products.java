package model;
/**Данный является моделью для файла products.json
 * */
public class Products {
    private int productId;
    private String productName;
    public Products(int productId, String productName){
        this.productId=productId;
        this.productName=productName;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
