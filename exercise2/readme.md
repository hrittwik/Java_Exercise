Java Assignments 2: Inheritance and Polymorphism

Objective: At the end of the assignments, participants will be able to create abstract classes,
Create a new class by extending an existing class, write code to exhibit polymorphic behavior of a method call, use of interfaces

Concept: Inheritance and Polymorphism

1.Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message 

“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

You must not allow the user to declare an object of Instrument class.

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behavior of  play method.

Use the instanceof operator to print that which object stored at which index of instrument array.         
  

2.Create an abstract class Compartment to represent a rail coach. Provide a abstract function notice in this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice suitable to the type of the compartment.

Create a class TestCompartment . Write main function to do the following:

Declare an array of Compartment pointers of size 10.

Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.

Check the polymorphic behavior of the notice method.


3.Create a class Medicine to represent a drug manufactured by a pharmaceutical company. Provide a function displayLabel() in this class to print Name and address of the company. 

Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.

Create a class TestMedicine . Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 

Refer Java API Documentation to find out random generation feature. 

Check the polymorphic behavior of the displayLabel() method.

4.Write a program that accepts two numbers and a operator like (+,-,*, /) as command line arguments and perform the appropriate operation indicated by operator. 

If the user enters any other character the appropriate message will be displayed. The output of the program should be displayed to the user.

5.Create a class Car which contains members speed, noOfGear. The class has a method drive() which is responsible to provide starting speed and noOfGears to a Car.  Implement display() method which will display all attributes of Car class.

The class SportCar is derived from the class Car which adds new features AirBallonType. When this method is invoked, initial speed and gear status must be displayed on console.  Override the display method which display all attribute of the SportCar. Make use of super class display() method.
