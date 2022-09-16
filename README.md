# Pet Project

This project will have three classes: Pet (the blueprint class), PetDemoSC (using Scanner class) and PetDemoDB (using JOptionPane).

The Pet class should have the following attributes (instance fields or instance variables): 
name: The name attribute holds the name of a pet. 
animal: The animal attribute holds the type of animal that the pet is. (i.e. “Dog”, “Cat” and “Bird”). 
age: The age attribute holds the pet’s age.
isAdopted: True if the animal is adopted and false if the animal is waiting for adoption.

The Pet class should have the following methods & constructors: 
Constructor (no parameters): which sets the name= “Animal”, animal = “Dino”, age = 0, isAdopted = false. 
Constructor (overloaded): which accepts values for each of the instance variables

setName: which stores a value in the name attribute. 
setAnimal: which stores a value in the animal attribute. 
setAge: which stores a value in the age attribute. 
setIsAdopted: which stores a Boolean value in the isAdopted attribute.

getName: which returns the value of the name attribute. 
getAnimal: which returns the value of the animal attribute. 
getAge: which returns the value of the age attribute. 
getIsAdopted: which returns the value of whether the animal is adopted yet.
toString: which will create the desired output when the object is printed.

*you can use the main method of the pet class to create your own instance and test the methods 


Write a PetDemoSC class and a PetDemoDB class that prompts the user for the pet’s name, animal type, age and whether the animal has been adopted. Your program should pass the attributes to the Pet class (via a constructor) and include an output statement that calls the Pet class’s get methods, and displays all relevant information.
