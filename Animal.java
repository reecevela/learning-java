public class Animal {
    public void speak() {
        System.out.println("This animal makes a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void speak {
        System.out.println("Neat! I'm a kitty that meows");
    }
}

public class Dog extends Animal {
    @Override
    public void speak {
        System.out.println("Ayo I'm a dog and I can BARK!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal jeremy = new Animal();
        Dog fido = new Dog();
        Cat slinky = new Cat();

        jeremy.speak();
        myDog.speak();
        myCat.speak();
    }
}