package amazon;

public class OrderItems {

    Product p1 = new Product("laptop",90000,1);
    Product p2 = new Product("mobile",50000,2);
    Product p3 = new Product("earbuds",9000,3);

    int p1price = p1.price * p1.quantity;
    int p2price = p2.price * p2.quantity;
    int p3price = p3.price * p3.quantity;


     int totalprice = p1price + p2price + p3price;






}

