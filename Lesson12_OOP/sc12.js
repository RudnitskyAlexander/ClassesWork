// class Apple{

//    constructor(type, weight){
//       this.type=type;
//       this.weight=weight;
//    }

// print(){
//    console.log("Сорт: "+this.type+" Вес: "+this.weight+"\n");
//       }
// }

// const apple1= new Apple("Белый налив", 100);
// apple1.print();

// # Класс Вино
// Создать класс Вино для хранения информации о наличии вина в винном магазине.
// Поля класса:
// - название
// - вид (красное, белое, розовое)
// - кол-во бутылок
// Методы класса:
// - конструкторы
// - get, set
// - print - вывод информации о вине на экран
// - метод для подсчета кол-ва литров вина на складе. В одной бутылке - 0,7 литра
// Создать 3 объекта класса Вино:
// 1-й объект создать с помощью конструктора без параметров. Установить ему значения с помощью методов set.
// 2-й и 3-й объект создать с помощью конструктора с параметрами, передав значения через список аргументов.
// Для всех объектов вызвать метод print и метод для подсчета кол-ва литров вина на складе.   

// class Vine{
//    #name;
//    #type;
//    #quantity;

//    constructor(name, type, quantity){
//       this.#name=name;
//       this.#type=type;
//       this.#quantity=quantity;
//    }

// getName(){
//    return this.#name;
// }

// setName(name){
//    this.#name = name;
// }

// getType(){
//    return this.#type;
// }

// setType(type){
//    this.#type=type;
// }

// getQuantity(){
//    return this.#quantity;
// }

// setQuantity(quantity){
//    this.#quantity=quantity;
// }

// print(){
//    console.log("Название: "+this.#name+" Вид: "+this.#type+"Количество: "+this.#quantity+"\n");
//       }

// howLiters(name, quantity){
//    let summ=0;
//    summ=quantity*0.7;
//    console.log("Количество вина "+name+" "+summ+" литров");
// }

// }

// const vine1= new Vine("Совиньен ","Белое ", 8);
// vine1.print();
// const vine2= new Vine("Шардоне ","Крассное ", 3);
// vine2.print();
// const vine3= new Vine("Брускетт ","Розовое ", 9);
// vine3.print();

// const vine4 = new Vine();
// vine4.setName('Tores ');
// vine4.setType('strong ');
// vine4.setQuantity(5);

// vine4.print();

// vine1.howLiters(vine1.getName(), vine1.getQuantity());
// vine4.howLiters(vine4.getName(), vine4.getQuantity());

// # Наследование Класс Учитель
// Создать класс Person
// Поля:
// - ФИО
// - дата рождения
// Методы:
// - print()
// - calcAge, возраст вычисляем через объекты класса Date
// Создать класс-наследник Person с именем Teacher.
// Поля:
// - список предметов, которые ведет учитель
// Члены Teacher - закрытые

class Person{

   constructor(sernameNamePetroname, dataBursday){
      this.sernameNamePetroname=sernameNamePetroname;
      this.dataBursday=dataBursday;
      }

      print(){
        console.log("Фамилия,Имя, Отчество : "+this.sernameNamePetroname+" Дата рождения: "+this.dataBursday+"\n");
      } 
 
}

pavel= new Person ("Самбуров Павел Валерьевич", 1980);
pavel.print();
