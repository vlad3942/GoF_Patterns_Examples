package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n3_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vladislav
 */
public class ProductCatalog {

    // Интерфейс продукта
    public interface Product {
        String getName();
        double getPrice();
        void showDetails();
    }

    // Класс для простых товаров
    public static class SimpleProduct implements Product {
        private String name;
        private double price;

        public SimpleProduct(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public double getPrice() {
            return price;
        }

        @Override
        public void showDetails() {
            System.out.println("Product: " + name + ", Price: $" + price);
        }
    }

    // Класс для композитных товаров (набор товаров)
    public static class CompositeProduct implements Product {
        private String name;
        private List<Product> products = new ArrayList<>();

        public CompositeProduct(String name) {
            this.name = name;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(product);
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public double getPrice() {
            // Цена композитного продукта — это сумма цен всех входящих в него продуктов
            double total = 0;
            for (Product product : products) {
                total += product.getPrice();
            }
            return total;
        }

        @Override
        public void showDetails() {
            System.out.println("Composite Product: " + name + ", Total Price: $" + getPrice());
            for (Product product : products) {
                product.showDetails();
            }
        }
    }

    // Пример использования
    public static void main(String[] args) {
        // Создаем простые продукты
        Product phone = new SimpleProduct("Smartphone", 699.99);
        Product laptop = new SimpleProduct("Laptop", 1299.99);
        Product charger = new SimpleProduct("Charger", 29.99);

        // Создаем набор из нескольких продуктов
        CompositeProduct techBundle = new CompositeProduct("Tech Bundle");
        techBundle.addProduct(phone);
        techBundle.addProduct(laptop);
        techBundle.addProduct(charger);

        // Создаем ещё один композитный продукт (например, комплект электроники)
        CompositeProduct electronicsSet = new CompositeProduct("Electronics Set");
        electronicsSet.addProduct(techBundle); // Включаем предыдущий набор
        electronicsSet.addProduct(new SimpleProduct("Headphones", 199.99)); // Добавляем ещё продукт

        // Показываем детали всех товаров
        System.out.println("Simple product details:");
        phone.showDetails();

        System.out.println("\nTech bundle details:");
        techBundle.showDetails();

        System.out.println("\nElectronics set details:");
        electronicsSet.showDetails();
    }

}
