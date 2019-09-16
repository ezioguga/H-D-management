/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gugatharsan
 */
public class Inventory {
    private String itemName;
    private int inventId;
    private int quantity;

    public Inventory(String itemName, int inventId, int quantity) {
        this.itemName = itemName;
        this.inventId = inventId;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getInventId() {
        return inventId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setInventId(int inventId) {
        this.inventId = inventId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
