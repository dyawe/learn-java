package fundamentals.oop;

public class Dog {
    private int size;
    private String breed;
    private String name;

    void bark() {
        //size affects the bark

        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14 & size < 60){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
    String getBreed(){
        return breed;
    }

    void setBreed(String breedValue){
        breed = breedValue;
    }

    int getSize(){
        return size;
    }

    void setSize(int sizeValue){
        size = sizeValue;
    }
}
