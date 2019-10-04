package lemubit.academy.LaptopDetails;

public class Laptop {
    String name;
    int price;
    int ramSize;

    public Laptop() {
    }

    public Laptop(String name, int price, int ramSize) {
        this.name = name;
        this.price = price;
        this.ramSize = ramSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
}
