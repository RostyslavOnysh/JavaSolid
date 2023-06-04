# SOLID

is an acronym that represents a set of principles for designing and writing maintainable and extensible software. These
principles help developers create software that is modular, flexible, and easy to understand and modify. Let's go
through each principle and its features:

* ***Single Responsibility Principle (SRP):***

SRP states that a class should have only one reason to change, meaning it should have a single responsibility.
A class should focus on doing one thing well and not be responsible for multiple unrelated tasks.
Example: Let's say you have a UserService class that handles user authentication and user data manipulation. Instead,
you should separate these responsibilities into two classes: AuthenticationService and UserRepository.

* ***Open/Closed Principle (OCP):***

  OCP suggests that classes should be open for extension but closed for modification.
  Software entities (classes, modules, etc.) should be designed in a way that allows them to be easily extended with new
  functionality without modifying their existing code.
  Example: Consider a Shape class with a method calculateArea(). Instead of modifying the Shape class every time you
  want to add a new shape, you can create new classes (e.g., Circle, Square) that inherit from Shape and provide their
  own implementation of calculateArea().

* ***Liskov Substitution Principle (LSP):***

  LSP states that objects of a superclass should be replaceable with objects of its subclasses without affecting the
  correctness of the program.
  Subtypes must adhere to the contract defined by the supertype, ensuring that the behavior of the program remains
  consistent.
  Example: If you have a Bird superclass and a Duck subclass, the Duck class should be able to replace instances of Bird
  without causing any issues or violating the expected behavior defined by the Bird class.

* ***Interface Segregation Principle (ISP):***

  ISP suggests that clients should not be forced to depend on interfaces they do not use.
  It promotes the idea of smaller and more specific interfaces, tailored to the needs of clients.
  Example: Let's say you have an Employee interface with methods like calculateSalary() and calculateTax(). Instead, you
  can split it into two interfaces: SalaryCalculable and TaxCalculable, which can be implemented by separate classes
  based on specific requirements.

* ***Dependency Inversion Principle (DIP):***

  DIP states that high-level modules/classes should not depend on low-level modules/classes. Both should depend on
  abstractions.
  It promotes loose coupling between modules, making it easier to change the implementation of low-level modules without
  affecting high-level modules.
  Example: Consider a scenario where a UserController depends directly on a DatabaseService class. Instead, you can
  introduce an interface (e.g., DatabaseServiceInterface) and make both UserController and DatabaseService depend on
  this abstraction. This way, you can easily switch to a different database implementation without modifying the
  UserController.
  By following these SOLID principles, you can create code that is modular, easier to maintain, and less prone to bugs.
  These principles promote good software design practices and can lead to more robust and flexible systems.