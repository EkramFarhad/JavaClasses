package Class19;

    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed*/
public class Book {

    String name;
    int pages;
    int publishDate;





    Book(String name, int pages){

        this.name=name;
        this.pages=pages;
    }
    Book (String name, int pages, int publishDate){

        this(name,pages);
        this.publishDate=publishDate;

    }

    void printInf0(){
        System.out.println(" name "+ name+ " Pages "+ pages);
        System.out.println(" name "+ name+ " Pages "+ pages + " DateOfPublish "+ publishDate);
    }



    //-----------------------------
    public static void main(String[] args) {

        Book book = new Book("Ekram",1000,2021);
        book.printInf0();

    }

}
