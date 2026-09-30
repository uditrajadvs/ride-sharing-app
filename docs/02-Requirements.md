# Requirements Specification

# Functional Requirements

## FR-01 Ride Request

Passenger should be able to request a ride by providing:

- Current Location
- Destination

Expected Result:

- Ride created successfully.

---

## FR-02 Driver Matching

System shall:

- Calculate distance between passenger and drivers.
- Find nearest available driver.
- Assign ride.

Expected Result:

- Nearest driver assigned.

---

## FR-03 Vehicle Support

System shall support:

- Bike
- Car

Future Vehicle Types:

- Luxury Car
- Scooter
- Van

---

## FR-04 Fare Calculation

System shall support:

### Standard Fare

distance × fare_per_km

### Shared Fare

distance × fare_per_km × 0.5

### Luxury Fare

distance × fare_per_km × 1.5

---

## FR-05 Ride Status Management

Supported statuses:

- SCHEDULED
- ONGOING
- COMPLETED

---

## FR-06 Notifications

Passenger and Driver should receive:

- Ride Scheduled
- Ride Started
- Ride Completed

---

# Non Functional Requirements

## Scalability

Support addition of:

- New Vehicles
- New Fare Strategies

without modifying existing code.

---

## Extensibility

System should follow Open-Closed Principle.

---

## Maintainability

Code should follow:

- SOLID Principles
- OOP Concepts

---

## Reliability

Driver availability should be maintained correctly.

---

## Performance

Nearest driver matching should execute efficiently.