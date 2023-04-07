package org.example.hw1;

import java.util.*;

public class HotDrinksMachine implements VendingMachine, Iterator<Product> {
    private List<Product> products;
    int index;

    public HotDrinksMachine() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product item) {
        if(item instanceof HotDrink)
            products.add(item);
        else
            System.out.println("\nНельзя положить это в этот автомат");
    }

    public Product getProduct(String name) {
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        System.out.println("\nТакого напитка нет");
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for(Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) &&
                        ((HotDrink) product).getVolume() == volume &&
                        ((HotDrink) product).getTemperature() == temperature) {
                    System.out.println("\nЗаберите напиток.");
                    return (HotDrink) product;
                }
            }
        }
        System.out.println("\nТакого напитка нет =(");
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();
    }

    @Override
    public Product next() {
        return products.get(index++);
    }

    /**
     * Метод выводит с помощью итератора все напитки, которые есть в автомате, отсортированные с помощью компоратора
     */
    public void showMeAll(){
        products.sort(Product::compareTo);
        while(this.hasNext()){
            System.out.println(this.next());
        }
    }
}
