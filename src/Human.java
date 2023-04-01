public class Human {
    void run(){
        System.out.println("Human can eat!");
    }
}
class Hiruni extends Human{
    void run(){
        System.out.println("Hiruni can eat!");

    }

    public static void main(String[] args) {
        Hiruni h=new Hiruni();
        h.run();
    }
}
