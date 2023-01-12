package Lesson43_StreamAPI;

import java.util.ArrayList;
import java.util.List;

//создайте класс автомобили. он должен хранить информацию о названии автомобиля, год выпуска, цена, цвет. объем двигателя.
//нужно создать набор автомобилей и выполнить следующие задания:
//показать все автомобили
//показать автомобили заданного цвета
//показать автомобили заданного объема
//показать все автомобили дороже заданной цены
//показать все автомобили чей год выпуска находится в указанном диапазоне
class Auto {
    private String marka;
    private int yearOfProd;
    private int price;
    private String colour;
    private int volume;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Auto(String marka, int yearOfProd, int price, String colour, int volume) {
        this.marka = marka;
        this.yearOfProd = yearOfProd;
        this.price = price;
        this.colour = colour;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", volume=" + volume +
                '}';
    }
}


public class Task3 {
    public static void main(String[] args) {


        List<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Lada Kalina", 2010, 4000, "White", 1600));
        autoList.add(new Auto("BMW X3", 2005, 15000, "Blue", 3000));
        autoList.add(new Auto("Hundai Accent", 2008, 5000, "Red", 1300));
        autoList.add(new Auto("KIA Sportage", 2015, 1700, "Silver", 1900));
        autoList.add(new Auto("Hundai SantaFe", 2018, 25000, "Black", 2500));

        System.out.println("Весь список: ");
        autoList.stream().forEach(x -> System.out.println(x + ", "));
        System.out.println("\n==============");

        System.out.println("Список красных машин: ");
        autoList.stream().filter(x -> x.getColour().equals("Red")).forEach(x -> System.out.print(x + ", "));
        System.out.println("\n==============");


        System.out.println("Список машин с объемом двигателя 1900: ");
        autoList.stream().filter(x -> x.getVolume() == 1900).forEach(x -> System.out.print(x + ", "));
        System.out.println("\n==============");

        System.out.println("Список машин с ценой более: ");
        autoList.stream().filter(x -> x.getPrice() >5000).forEach(x -> System.out.println(x + ", "));
        System.out.println("\n==============");

        System.out.println("Список машин в заданном диапазоне года выпуска: ");
        autoList.stream().filter(x -> x.getYearOfProd() >2010&&x.getYearOfProd()<2020 ).forEach(x -> System.out.println(x + ", "));
        System.out.println("\n==============");

    }

}
