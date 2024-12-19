package DemoPackage;

//Superclass Animal
class Animal {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass Dog inheriting from Animal
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

public class Methodoverriding  {
 public static void main(String[] args) {
     Animal animal = new Animal();
     animal.makeSound();  // Output: Animal makes a sound
     
     Dog dog = new Dog();
     dog.makeSound();     // Output: Dog barks
     
     // Using Animal reference to refer to Dog object
     Animal anotherAnimal = new Dog();
     anotherAnimal.makeSound();  // Output: Dog barks (dynamic method dispatch)
 }
}

