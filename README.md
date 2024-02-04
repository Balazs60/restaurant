# restaurant

## Getting Started

### Prerequisites

* Java JDK
* Maven (optional, Maven wrapper included)

### Installation

#### Clone the repository

```
git clone https://github.com/Balazs60/restaurant
```

#### Compile the application

```
./mvnw clean package
```

#### Create postgres database

* Name: restaurant
* User: postgres

#### Set environment variables

```
export DB_HOST=localhost
export DB_NAME=restaurant  
export DB_PASSWORD=...
export DB_PORT=5432
export DB_USER=postgres
```

#### Run the compiled program

```
java -jar target/restaurant-1.0.0-SNAPSHOT.jar  
```

## Smoke test  

Run the queries in test-data.sql in postgresql.

Run the following HTTP request:

```
GET http://localhost:8080/api/restaurants/
```

Example response: 

```json
[
  {
    "id": "150e8400-e29b-41d4-a716-446655440000",
    "name": "Taco Place",
    "menu": [
      {
        "id": "650e8400-e29b-41d4-a716-446655440000",
        "name": "Taco",
        "description": "Description for Item3",
        "price": 20,
        "restaurant": "150e8400-e29b-41d4-a716-446655440000"
      }
    ]
  },
  {
    "id": "250e8400-e29b-41d4-a716-446655440000",
    "name": "Pizza Place",
    "menu": []
  },
  {
    "id": "350e8400-e29b-41d4-a716-446655440000",
    "name": "McDonalds",
    "menu": [
      {
        "id": "450e8400-e29b-41d4-a716-446655440000",
        "name": "Hamburger",
        "description": "Description for Hamburger",
        "price": 10,
        "restaurant": "350e8400-e29b-41d4-a716-446655440000"
      },
      {
        "id": "550e8400-e29b-41d4-a716-446655440000",
        "name": "Potato",
        "description": "Description for Pizza",
        "price": 15,
        "restaurant": "350e8400-e29b-41d4-a716-446655440000"
      }
    ]
  }
]
```
