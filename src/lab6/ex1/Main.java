package lab6.ex1;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Lion();
        Animal panther = new Panther();
        Animal tiger = new Tiger();
        lion.eat();
        lion.sound();
        panther.eat();
        panther.sound();
        tiger.eat();
        tiger.sound();
    }
}
