package lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruitBox = new ArrayList<>();

    public void addFruitToBox(T fruit){
        fruitBox.add(fruit);
    }


    public void getFruitBoxWeight() {
        float boxWeight = (float) (fruitBox.size()*fruitBox.get(0).weight);
        System.out.println("Вес коробки " + boxWeight);
    }

    public void transferToBox(Box<T> anotherBox){
        this.fruitBox.addAll(anotherBox.fruitBox);
        anotherBox.fruitBox.clear();
        System.out.println("Вес новой коробки " + this.fruitBox.size()*this.fruitBox.get(0).weight);
        boolean isEmpty = anotherBox.fruitBox.size() == 0;
        System.out.println("Вторая коробка пустая: " + isEmpty);
    }

    public boolean compareBoxes(Box<? extends Fruit> anotherBox){
        return this.fruitBox.size()*this.fruitBox.get(0).weight == anotherBox.fruitBox.size()*anotherBox.fruitBox.get(0).weight;
    }
}
