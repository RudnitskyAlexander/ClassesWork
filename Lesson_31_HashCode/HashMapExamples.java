package Lesson_31_HashCode;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
//        Map<Integer, String> studList = new HashMap<>();
//        studList.put(1, "Алисионок Екатерина");
//        studList.put(3, "Козловкий Константин");
//        studList.put(5, "Красько Денис");
//        studList.put(2, "Калацкий Павел");
//        studList.put(4, "Кондратенко Владимир");
//        studList.put(6, "Алисионок Екатерина");
//
//        for (Integer key : studList.keySet()) {
//            System.out.println(key + " " + studList.get(key));

        //картотека котов "кличка-вес"
//        Map<String, Integer> catsCabinet = new HashMap<>();
//        Random gen = new Random();
//        // final int catsQty=10;
//        String[] catNames = {"Васька", "Барсик", "Мурзик", "Борис", "Кеша", "Бадя", "Мурка"};
//        for (int i = 0; i < catNames.length; i++) {
//            Integer catRandomIndex = gen.nextInt(catNames.length);
//            String catName = catNames[catRandomIndex];
//            Integer weight = gen.nextInt(10) + 1;
//            System.out.println(catName + " " + weight);
//            catsCabinet.put(catName, weight);
//        }
//        System.out.println("\n\"Картотека\"");
//        for (String key : catsCabinet.keySet()) {
//            System.out.println(key + " " + catsCabinet.get(key));
//        }
//        if (catsCabinet.containsValue(5)) {
//            for (Map.Entry<String, Integer> pair : catsCabinet.entrySet()) {
//                if (pair.getValue().equals(5)) {
//                    System.out.println("Коты весом 5 кг:");
//                    System.out.println(pair.getKey() + " " + pair.getValue());
//                }
//            }
//        } else {
//            System.out.println("Нет таких котов");

        //определяем количество вхождения слова в текст
//        String text = "Моя мама – самый дорогой человек для меня. Я её очень люблю. Люблю не за что-то, а просто так, просто за то, " +
//                "что она у меня есть. Я очень горжусь и дорожу своей мамой. Ближе неё у меня никого нет. Мою маму зовут Татьяна Николаевна. " +
//                "Она красивая. Люблю мамину улыбку и большие зелёные глаза, которые сверкают озорными огоньками, задорный смех и её руки, заботливые, " +
//                "тёплые, дорогие мне две ладошки. Моя мама очень добрая, хорошо ладит с людьми, все её уважают и любят. Она умеет поддержать " +
//                "в трудную минуту и согреть своей теплотой, когда иногда мне бывает грустно и горько. Мама заботится о нас с братом с самого " +
//                "рождения, дарит нам свою доброту, заботу, нежность и материнскую любовь. Я очень благодарен маме за всё, что она делает. " +
//                "Да и я всегда стараюсь ей помочь чем-то. Я помогаю маме носить тяжёлые сумки с продуктами, помогаю с уборкой в нашем доме. " +
//                "Моя мама очень вкусно готовит, и я люблю помогать ей в этом. Узнаю довольно много полезного во время приготовления пищи." +
//                " Мама учит меня нужным и полезным знаниям, которые пригодятся мне в жизни. Ещё я очень люблю гулять с ней — мне всегда интересно." +
//                " Мы ходим в гости, в кино, на выставки, просто дышим свежим воздухом. Хочу, чтобы моя мама никогда не огорчалась, всегда была радостной и" +
//                " весёлой, а её глаза светились, как два солнышка. Хочу, чтобы улыбка её чаще радовала меня и окружающих людей. Хочу пожелать моей маме " +
//                "счастья, здоровья и всего того, чего бы ей хотелось, но ещё не сбылось. Пусть сбудутся все её мечты. Ведь не только нам, детям, " +
//                "нужна любовь, внимание и забота – маме они нужны тоже. Дорогая мама, я очень сильно тебя люблю! Я буду стараться радовать тебя" +
//                " каждый день своей учёбой, хорошим поведением и всегда буду помогать тебе. Мама, спасибо, что ты у меня есть!\n";
//
//        String[] words = text.split(" |,| |/");
//
//        System.out.println(Arrays.toString(words));
//        Map<String, Integer> dict = new HashMap<>();
//        for (String word : words) {
//            if (dict.containsKey(word)) {
//                dict.put(word, dict.get(word) + 1);
//
//            } else {
//                dict.put(word, 1);
//            }
//        }
//        System.out.println("Словарь");
//        for (String key : dict.keySet()        ) {
//            if (dict.get(key)>1){
//            System.out.println("\""+key+"\" "+dict.get(key));}
//        }

        Map<Person, List<? extends Pet>> hm1 = new HashMap<>();

        hm1.put(new Person("Иван"), Arrays.asList(new Cat("Васька"), new Dog("Бобик")));


    }
}


