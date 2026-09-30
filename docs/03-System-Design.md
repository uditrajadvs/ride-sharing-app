# System Design

## High Level Architecture

```text
Passenger
    |
    v
Ride Matching Service
    |
    +-----> Driver
    |
    +-----> Ride
                 |
                 +------ Fare Strategy
                 |
                 +------ Notifications
```

## Modules

### Passenger Module

- Request ride
- Receive notifications

### Driver Module

- Accept ride
- Receive notifications

### Ride Module

Responsibilities:

- Fare Calculation
- Ride Status
- Notifications

### Vehicle Module

Supports different vehicle types.

### Matching Service

Responsible for:

- Driver Registration
- Driver Search
- Ride Assignment

### Strategy Module

Responsible for:

- Dynamic fare calculation