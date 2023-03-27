package Class19;

public class Furniture {

    String type;
    double price;
    String color;


    Furniture(String type, double price, String color) {

        this.type = type;
        this.price = price;
        this.color = color;
    }


//   void Furniture(){
//
//    }
// the moment you add modifier to the class it change to method


    void print() {
        System.out.println(type + " price is " + price + " and color is " + color);
    }
}
