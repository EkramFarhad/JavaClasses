package Class17;

public class DogTester {
    public static void main(String[] args) {

        Dog huskey = new Dog("Huskey", "Huskey th dog", "white", 2, 25.2);
        huskey.printInfo();
        Dog bulldog = new Dog("bullDog", "BullDog the dog", "Yellow", 3, 27.1);
        bulldog.printInfo();
        Dog labrador = new Dog("Labrador", "Labrador the dog", "blue", 4, 28.0);
        labrador.printInfo();
    }
}
