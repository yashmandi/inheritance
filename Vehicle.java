/*  Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a car". */


// Parent Class Vehicle
class Vehicle {
    // Method 
    public void drive() {
        System.out.println("Repairing a vehicle.");
    }
}

// Child Class Car
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car.");
    }
}
