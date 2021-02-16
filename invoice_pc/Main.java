package invoice_pc;

public class Main {
    public static void main(String[] args) {
        // create object
        invoice customer1 = new invoice(1245);

        // set quantity
        customer1.setQuantity(4);
        // set unitprice
        customer1.setUnitprice(105.99);

        // compute total price
        System.out.println(customer1.getTotalPrice());
    }
}
