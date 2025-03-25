package DynamicOnlineMarket;
import java.util.*;
abstract class ProductCategory{
    private String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

class BookCategory extends ProductCategory{
    BookCategory(){
        super("Books");
    }
}

class ClothingCategory extends ProductCategory{
    ClothingCategory(){
        super("Clothes");
    }
}

class GadgetCategory extends ProductCategory{
    GadgetCategory(){
        super("Gadgets");
    }
}

class Product<T extends ProductCategory>{
    private String name;
    private double price;
    private T category;

    Product(String name,double price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage){
        this.price-=this.price*(percentage)/100;
    }

    public String toString(){
        return "ProductName "+name + " | Category: "+category.getCategoryName()+" | Price "+price;
    }
    
}

class ProductCatalogue{
    private List<Product<?>> catalog=new ArrayList<>();

    public void addProduct(Product<?> product){
        catalog.add(product);
    }

    public void showCatalog(){
        for(Product<?> product: catalog){
            System.out.println(product);
        }
    }
}

public class DynamicOnlineMarket{
    public static void main(String[] args){
        Product<BookCategory> book=new Product<>("The Last of Us", 15.99, new BookCategory());
        Product<ClothingCategory> shirt=new Product<>("Polo", 10.99 , new ClothingCategory());
        Product<GadgetCategory> phone=new Product<>("Iphone 16", 699.99, new GadgetCategory());
        book.applyDiscount(10);
        phone.applyDiscount(5);


        ProductCatalogue catalog=new ProductCatalogue();
        catalog.addProduct(book);
        catalog.addProduct(phone);
        catalog.addProduct(shirt);

        System.out.println("Product Catalog");
        catalog.showCatalog();
    }
}