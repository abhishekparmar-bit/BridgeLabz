package Assignment_9sep;

class Product{
    String productname;
    int price;
    static int totalproducts;

    Product(String productname, int price){
        this.productname=productname;
        this.price=price;
        totalproducts++;
    }

    void displayproductdetails(){
        System.out.println(productname+" "+price);
    }
    static void displaytoatalProducts(){
        System.out.println(totalproducts);
    }
}
public class Product_Inventory {
    public static void main(String[] args) {
        Product p1=new Product("Amul",30);
        Product p2= new Product("Nestle",50);
        p1.displayproductdetails();
        p2.displayproductdetails();
        Product.displaytoatalProducts();
    }
}
