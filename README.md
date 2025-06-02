# spring-boot-patterns

---

## Design Patterns Used

### Singleton Pattern

The **Singleton** pattern ensures a class has only one instance and provides a global point of access to it.

- **Class:** `CarCounter` (`src/main/java/com/example/spring_boot/singletons/CarCounter.java`)
- **How it works:**
    - Spring Boot manages a single instance of `CarCounter` using the `@Component` annotation.
    - `CarCounter` provides thread-safe methods to increment and retrieve the car count.
    - The singleton instance is injected wherever needed using constructor injection.

### Factory Pattern

The **Factory** pattern provides a way to create objects without specifying the exact class of the object that will be created.

- **Class:** `CarFactory` (`src/main/java/com/example/spring_boot/factories/CarFactory.java`)
- **How it works:**
    - `CarFactory` contains a `createCar(String type)` method.
    - Based on the `type` parameter, it creates and returns an instance of a specific `Car` implementation (`Sedan`, `SUV`, or `Truck`).
    - Each time a car is created, the factory updates the singleton `CarCounter`.

---

## Example Endpoints

- `GET /api/factory/car?type=sedan` — Creates a car of the specified type.
- `GET /api/singleton/count` — Returns the total number of cars created (using the singleton counter).

---