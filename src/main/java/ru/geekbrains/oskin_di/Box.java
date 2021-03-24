package ru.geekbrains.oskin_di;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> content;

    public Box(T... items) {
        this.content = new ArrayList<>(Arrays.asList(items));
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(T fruit) {
        content.add(fruit);
    }

    public float getWeightBox() {
        if (!(content.size() == 0)) {
            float weightBox = content.get(0).getWeight() * content.size();
            return weightBox;
        }
        return 0;
    }

    public boolean compare(Box<T> another) {
        return Math.abs(getWeightBox() - another.getWeightBox()) < 0.0001;
    }

    public void pourFromCurrent(Box<T> another) {
        int quantity = content.size();
        if (!(content.size() == 0)){
            for (int i = 0; i < quantity; i++) {
                another.setContent(content.get(0));
                content.remove(0);
            }
        } else {
            System.out.println("Коробка пустая");
        }

    }
}
