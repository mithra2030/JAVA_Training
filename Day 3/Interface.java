interface Pet {
    void play();
    void meow();
    void bark();
}

class Animal {
    // Parent class
}

class Dog extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("Dog is playing...");
    }

    @Override
    public void meow() {
        System.out.println("Dog doesn't meow.");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("Cat is playing...");
    }

    @Override
    public void meow() {
        System.out.println("Cat is meowing...");
    }

    @Override
    public void bark() {
        System.out.println("Cat doesn't bark.");
    }
}

public class Interface {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.play();
        dog.bark();
        dog.meow();

        Cat cat = new Cat();

        cat.play();
        cat.bark();
        cat.meow();
    }
}