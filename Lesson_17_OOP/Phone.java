package Lesson_17_OOP;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Phone {
    long number;
    String model;
    int weight;

    public Phone() {
        number = 123;
        model = "X";
        weight = 0;
    }


    public Phone(long number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.

    public void receiveCall(String nameCall) {
        System.out.println("\n Звонит " + nameCall);
    }

    public int getNumber(int mobNumber) {
        int number = mobNumber;
        return number;
    }

    @Override
    public String toString() {
        return "\n number : " + number + "\n model : " + model + "\n weight : " + weight;
    }
}
