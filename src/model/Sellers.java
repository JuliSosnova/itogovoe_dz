package model;
/**Данный является моделью для файла sellers.json
 * */
public class Sellers {
    private int sellerId;
    private String lastName;
    private String firstName;


    public Sellers(int sellerId, String lastName, String firstName) {
        this.sellerId = sellerId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
