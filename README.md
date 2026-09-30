# Ride Sharing Application 🚖

A Java-based Ride Sharing Application implementing SOLID Principles and Design Patterns for nearest-driver matching, dynamic fare calculation, ride lifecycle management, and user notifications.

## Features

- Ride Request System
- Nearest Driver Matching
- Multiple Vehicle Types
- Dynamic Fare Calculation
- Ride Status Tracking
- Passenger & Driver Notifications
- SOLID Principles
- Design Patterns

## Supported Vehicle Types

- Bike
- Car
- Future Support:
    - Luxury Car
    - Electric Scooter
    - Van

## Supported Fare Strategies

- Standard Fare
- Shared Fare
- Luxury Fare

## Design Patterns Used

- Strategy Pattern
- Observer Pattern
- Factory Pattern (Future Enhancement)

## SOLID Principles

- Single Responsibility Principle
- Open Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

## Project Structure

```text
src
├── main
│   └── java
│       └── org.udevs.LLDProject.ridesharingapp
│           ├── model
│           │   ├── User.java
│           │   ├── Passenger.java
│           │   ├── Driver.java
│           │   ├── Vehicle.java
│           │   ├── Bike.java
│           │   └── Car.java
│           │
│           ├── entity
│           │   ├── Ride.java
│           │   ├── RideStatus.java
│           │   └── Location.java
│           │
│           ├── strategy
│           │   ├── FareStrategy.java
│           │   ├── StandardFareStrategy.java
│           │   ├── SharedFareStrategy.java
│           │   └── LuxuryFareStrategy.java
│           │
│           ├── service
│           │   └── RideMatchingService.java
│           │
│           └── client
│               └── Client.java
│
└── test
    └── java
        └── org.udevs.LLDProject.ridesharingapp
            ├── entity
            │   ├── LocationTest.java
            │   └── RideTest.java
            │
            ├── strategy
            │   ├── StandardFareStrategyTest.java
            │   ├── SharedFareStrategyTest.java
            │   └── LuxuryFareStrategyTest.java
            │
            └── service
                └── RideMatchingServiceTest.java
```

## Recommended Tests for Project
- LocationTest.java ✅
- RideTest.java 
- RideMatchingServiceTest.java 
- StandardFareStrategyTest.java 
- SharedFareStrategyTest.java 
- LuxuryFareStrategyTest.java 

## Documentation

- [Project Overview](docs/01-Project-02-Requirements.md
- [ocs/03-System-Design.md
- [ocs/04-SOLID-Principles.md
- [Design Patterns](docss.md
- [ocs/06-UML-Class-Diagram.md
- [ocs/07-Test-Cases.md
- [Future Enhancements](docs/08-Future-thor

Udit Raj