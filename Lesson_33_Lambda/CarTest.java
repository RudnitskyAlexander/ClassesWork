package Lesson_33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarTest {
    public static void filterCars(List<Car> cars, Predicate<Car> predicate, Consumer<Car> consumer) {
        for (Car car : cars) {
            if (predicate.test(car)) {
                consumer.accept(car);
            }
        }
    }


    public static void main(String[] args) {

        Car car1 = new Car(Car.Body.CUPE, 200);
        Car car2 = new Car(Car.Body.SEDAN, 250);
        Car car3 = new Car(Car.Body.HATCHBACK, 284);
        Car car4 = new Car(Car.Body.CUPE, 300);
        Car car5 = new Car(Car.Body.UNIVERSAL, 200);
        Car car6 = new Car(Car.Body.HATCHBACK, 163);
        Car car7 = new Car(Car.Body.CUPE, 173);
        Car car8 = new Car(Car.Body.UNIVERSAL, 180);
        Car car9 = new Car(Car.Body.ROADSTER, 155);

        List<Car> carList = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9);

        filterCars(carList, (Car car) -> {
            return car.getPower() >= 200;
        }, (Car car) -> {
            System.out.println(car);
        });

        System.out.println("\nThe Cars with body CUPE");
        filterCars(carList, (Car car) -> {
            return car.getBody() == Car.Body.CUPE;
        }, (Car car) -> {
            System.out.println(car);
        });

        System.out.println("\nThe Cars with power more 200");
        filterCars(carList, (Car car) -> {
            return car.getPower() <= 200;
        }, (Car car) -> {
            System.out.println(car);
        });


        System.out.println("\nThe Cars with power more 200");
        filterCars(carList, (Car car) -> {
            return  (car.getBody() == Car.Body.SEDAN)&&(car.getPower() >= 200);
        }, (Car car) -> {
            System.out.println(car);
        });


//        List<Car> carList = new ArrayList<>();
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);

    }
}
