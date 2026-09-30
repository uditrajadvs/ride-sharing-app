# SOLID Principles

## S - Single Responsibility Principle

Each class has one reason to change.

Examples:

### Ride

Responsible only for ride management.

### RideMatchingService

Responsible only for matching rides.

---

## O - Open Closed Principle

System is open for extension but closed for modification.

Example:

Add:

```java
PeakHourFareStrategy
```

without changing existing strategies.

---

## L - Liskov Substitution Principle

Subclasses can replace parent classes.

Example:

```java
Vehicle vehicle = new Bike();
Vehicle vehicle = new Car();
```

---

## I - Interface Segregation Principle

Clients depend only on methods they need.

Example:

```java
FareStrategy
```

---

## D - Dependency Inversion Principle

Ride depends upon:

```java
FareStrategy
```

instead of concrete implementations.