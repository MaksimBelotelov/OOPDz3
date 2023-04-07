package org.example.hw1;

// Итератор добавлен в класс HotDrinksMachine для вывода всех напитков, имеющихся в автомате.
// Компоратор добавлен в класс Product для сортировки товаров в алфавитном порядке
// И то, и другое использовано в методе showMeAll()

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine m1 = new HotDrinksMachine();

        m1.addProduct(new HotDrink("Чай", 60.0, 200, 91));
        m1.addProduct(new HotDrink("Эспрессо", 120.0, 40, 90));
        m1.addProduct(new HotDrink("Американо", 120.0, 100, 84));
        m1.addProduct(new HotDrink("Капучино", 180.0, 200, 70));

        m1.showMeAll();
    }
}
