package Class24;

public abstract class Task {

    abstract void open();

    void edit(){
        System.out.println("No one was able to edit the task");
    }
    void close(){
        System.out.println("after edit done we closed the project");
    }
}

class JavaFile extends Task{

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends Task{

    @Override
    void open() {
        System.out.println("Opening the file in intellij");

    }
}
class WordFile extends Task{
    @Override
    void open() {
        System.out.println("Opening file from Microsoft");

    }

}

class main{
    public static void main(String[] args) {
        Task [] tasks ={new JavaFile(),new WordFile(), new PdfFile()};

        for (int i = 0; i < tasks.length; i++) {
            Task ts = tasks[i];
            ts.open();
            ts.edit();
            ts.close();

        }
    }
}
