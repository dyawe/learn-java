package fundamentals.oop;

public class DogTestDrive {
    public static void main(String[] args) {
        // Dog test code goes here
        Dog one = new Dog();
        one.setSize(50);
        one.bark();

//        Dog[] pets;
//        pets = new Dog[7];
        Dog[] pets = new Dog[7];
        pets[0] = new Dog();
        pets[0].setSize(20);
        int value = pets[0].getSize();
        int valueTwo = 20;
        System.out.println(value == valueTwo);
    }
}
