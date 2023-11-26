package model;
/**Данный является моделью для файла sales.json
 * */
public class Sales {
    private String saleId;
    private String sellerId;
    private String productId;
    private int num;
    private String saleDate;


    public Sales(String saleId, String sellerId, String productId, int num, String saleDate) {
        this.saleId = saleId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.num = num;
        this.saleDate = saleDate;
    }
}
