package invoice_pc;

// attempt this

public class invoice{
    private int itemid;
    private int quantity;
    private double unitprice;

    invoice(int itemid){
        this.itemid = itemid;
    }

    public Integer getItemid(){
        return itemid;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public String getTotalPrice(){
        double t = quantity * unitprice;
        return "Your Total Price is: " + t;
    }    
}