class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.weep();
        p.bark();
        p.eat();
    }
}