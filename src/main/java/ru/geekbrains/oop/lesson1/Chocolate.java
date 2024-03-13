package ru.geekbrains.oop.lesson1;

public class Chocolate extends Product{
    private String nuts;
    private String black;
    public Chocolate(String brand, String name, double price,String nuts,String black) {
        super(brand, name, price);
        this.nuts= nuts;
        this.black=black;
    }
    public String displayInfo() {
        return String.format("Тёмный шоколад:\n\t%s\n\t%s\n\t%.2f\n\tС орехами",
                brand, name, price,nuts,black );
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }
}
