/* Write a Java program to create a class called Animal with a method called makeSound().
 Create a subclass called Cat that overrides the makeSound() method to bark. */

// Animal Class

public class Animal{
    
    // Creating a method
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


// Cat Sub-class

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


