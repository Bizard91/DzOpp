package ru.geekbrains.oop.lesson1;

/**
 * Продукт
 */
public class Product {
    public Product( int i) {
    }

    //region Публичные методы

    public String displayInfo(){

        return String.format("%s - %s - %.2f", brand, name, price);
    }

    //endregion

    //region Конструкторы

    public Product(String brand, String name, double price){
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
        checkPriceChocolate(priceChocolate);

    }

    public Product(String name, double price){
        this("<BRAND>", name, price);
        /*brand = "<BRAND>";
        if (inputName == null || inputName.length() < 3){
            name = "<NAME>";
        }
        else {
            name = inputName;
        }
        if (inputPrice < 200){
            price = 200;
        }
        else {
            price = inputPrice;
        }*/
    }

    public Product(String name){
        this(name, 200);
        /*brand = "<BRAND>";
        price = 200;
        if (inputName == null || inputName.length() < 3){
            name = "<NAME>";
        }
        else {
            name = inputName;
        }*/
    }

    /*public Product(){
        this("<NAME>");
        brand = "<BRAND>";
        name = "<NAME>";
        price = 200;
    }*/

    //endregion

    //region Вспомогательные методы (доступны на уровне класса)

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else {
            this.brand = brand;
        }
    }

    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else {
            this.name = name;
        }
    }

    private void checkPrice(double price) {
        if (price < 200) {
            this.price = 200;
        } else {
            this.price = price;
        }
    }
        private void checkPriceChocolate(double priceChocolate){
            if (priceChocolate < 100) {
                this.priceChocolate = 100;
            } else {
                this.priceChocolate = priceChocolate;
            }
        }





    //endregion

    //region Свойства полей (getters and setters)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Double getPriceChocolate() {
        return priceChocolate;
    }

    public void setPriceChocolate(Double priceChocolate) {
        this.priceChocolate = priceChocolate;
    }

    //endregion

    //region Поля

    protected String name;
    protected String brand;
    protected double price;
    protected double priceChocolate;

    //endregion

}
