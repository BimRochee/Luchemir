/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalRecords;

/**
 *
 * @author Bim
 */
public class Medicine {

    private int id, buyingPrice, sellingPrice, quantity;
    private String name, description;

    public Medicine() {
        this.id = 0;
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.quantity = 0;
        this.name = "";
        this.description = "";
    }

    public Medicine(int id, int buyingPrice, int sellingPrice, int quantity, String name, String description) {
        this.id = id;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + ", buyingPrice=" + buyingPrice + ", sellingPrice=" + sellingPrice + ", quantity=" + quantity + ", name=" + name + ", description=" + description + '}';
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
