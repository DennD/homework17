package ru.geekbrains.oskin_di;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Надеюсь верно трактовал первые два задания, а если нет, то тогда осталось большое недопонимание.
 * Класс родитель Fruit сделал абстрактным(так как фрукта, как объекта не существует и в нем написал переопределяемый метод getWeight.
 * Обобщение <T> сделал наследуемым от класса Fruit, чтобы можно было обращаться к методу getWeight наследников.
 * Нужно ли делать проверку на совместимость классов в момент пересыпания из одной коробки в другую, если нам компилятор так и так не позволит
 * коробку с отличающимися фруктами использовать?
 */

public class MainApp {
    public static void main(String[] args) {
        String[] arr = {"asd", "qwe", "zxc", "rty", "fgh", "vbn"};
        Generic generic = new Generic();
        generic.swapArrayElements(3, 4, arr);
        System.out.println(Arrays.toString(arr));
        List<String> arrayList = new ArrayList<>();
        generic.transformArray(arr, arrayList);
        System.out.println(arrayList);



        Box<Apple> boxApple1 = new Box<>(new Apple(), new Apple(), new Apple(), new Apple());
        Box<Apple> boxApple2 = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> boxOrange1 = new Box<>(new Orange(), new Orange(), new Orange(), new Orange());
        Box<Orange> boxOrange2 = new Box<>(new Orange(), new Orange(), new Orange(), new Orange(), new Orange(), new Orange());
        System.out.println(boxApple1.getWeightBox());
        System.out.println(boxOrange2.getWeightBox());
        boxApple2.pourFromCurrent(boxApple1);
        System.out.println(boxApple1.getWeightBox());
        System.out.println(boxApple2.getWeightBox());

    }


    }





