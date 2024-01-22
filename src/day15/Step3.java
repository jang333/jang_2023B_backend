package day15;

public class Step3 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound(); //멍멍

        Cat cat = new Cat();
        cat.sound(); //야옹

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}
