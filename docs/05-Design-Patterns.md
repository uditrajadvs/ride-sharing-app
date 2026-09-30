# Design Patterns

# Strategy Pattern

## Problem

Different fare calculation methods.

## Solution

```java
FareStrategy
```

Implementations:

- StandardFareStrategy
- SharedFareStrategy
- LuxuryFareStrategy

---

# Observer Pattern

## Problem

Users need ride status updates.

## Solution

```java
Ride.updateRideStatus()
```

Notifies:

- Passenger
- Driver

---

# Factory Pattern (Suggested Improvement)

Current:

```java
new Bike()
new Car()
```

Future:

```java
VehicleFactory.createVehicle()
```

Benefits:

- Loose Coupling
- Extensibility
  ``