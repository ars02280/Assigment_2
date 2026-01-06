This project is a Java system for managing vehicles. It shows how to use:

Inheritance: Car, Motorcycle, and Truck inherit from Vehicle.

Abstraction: Vehicle is an abstract class.

Composition: Each vehicle has a Driver.

Class Hierarchy
Vehicle (Superclass): Abstract class with brand and year.

Car, Motorcycle, Truck (Subclasses): These classes extend Vehicle and implement startEngine and stopEngine.

Driver: A separate class for driver info.

Access Modifiers: * protected is used so subclasses can see brand and year.

private is used for specific fields like fuel type or license number.

Instructions
Open terminal.

Compile: javac *.java

Run: java Main
example of run
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/72078baf-46a0-4b02-8367-742e20bacc13" />


Reflection
Inheritance: It helped me avoid writing the same code many times. I put common things like "brand" in one place.

Overriding: It allowed each vehicle to have its own start message. Even if I use an array of Vehicles, Java knows which specific engine to start.

Challenges: The hardest part was using the super keyword in constructors and making sure the driver was not null before printing info.
