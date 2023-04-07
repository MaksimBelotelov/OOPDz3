package org.example.hw1;

public abstract class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return  name + ' ' + price + '\n';
    }

    @Override
    public int compareTo(Product o) {
        if((this.getName().compareToIgnoreCase(o.getName())) > 0) {
            return 1;
        }
        else if((this.getName().compareToIgnoreCase(o.getName())) < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
