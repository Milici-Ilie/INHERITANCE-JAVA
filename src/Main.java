public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);//calling the "Animal.java" method
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();//calling the "Dog.java" method
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();//calling the method from the "Animal.java" file
        animal.move(speed);//calling the method
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}