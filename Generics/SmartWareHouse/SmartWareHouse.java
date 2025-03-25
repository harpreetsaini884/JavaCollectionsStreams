import java.util.*;
abstract class  WareHouseItem{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    WareHouseItem(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String toString(){
        return name+" -$ "+price;
        // System.out.printlnx("Name of the Item "+getName()+" Price of the Item is "+ getPrice());
    }
    

}

class Electronics extends WareHouseItem{
    Electronics(String name,double price){
        super(name, price);
    }
}

class Groceries extends WareHouseItem{
    Groceries(String name,double price){
        super(name, price);
    }
}

class Furniture extends WareHouseItem{
    Furniture(String name,double price){
        super(name, price);
    }
}

class Storage<T extends WareHouseItem>{
    List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public List<T> getItem(){
        return items;
    }

}

class WareHouseutil{
    public static void displayItems(List<? extends WareHouseItem> items){
        for(WareHouseItem item:items){
            System.out.println(item);
        }
    }
}

public class SmartWareHouse{
    public static void main(String[] args){
        Storage<Electronics> electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200));
        electronicsStorage.addItem(new Electronics("SmartPhone", 800));

        Storage<Groceries> groceriesStorage=new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 1.5));
        groceriesStorage.addItem(new Groceries("Milk", 3.0));

        Storage<Furniture> furnitureStorage= new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 50));
        furnitureStorage.addItem(new Furniture("Table", 100));

        //  Display all the Items from the Storage

        System.out.println("Electronics");
        WareHouseutil.displayItems(electronicsStorage.getItem());

        System.out.println();

        System.out.println("Groceries");
        WareHouseutil.displayItems(groceriesStorage.getItem());

        System.out.println();

        System.out.println("Furniture");
        WareHouseutil.displayItems(furnitureStorage.getItem());
    }
}