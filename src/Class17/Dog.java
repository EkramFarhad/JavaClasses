package Class17;

public class Dog {

    String name;
    String color;
    int age;
    double weight;
    double height;
    String breed;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name = dogName;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;
        breed = dogBreed;


    }

    void printInfo() {
        System.out.println("Name " + name + " Breed " + breed + " age " + age + " Weigh "
                + weight + " color " + color);
    }


}
