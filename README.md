# spring-boot-graphql
This is basic Spring Boot project having GraphQL integration

### 1. Run application and open link
http://localhost:8080/graphiql?path=/graphql

### 2. Try below sample query and execute
```graphql
{
  getCustomer(cif:"87654321") {
    customerId
    cif
    name
    segment
    __typename
    accounts {
      id
      number
      type
      __typename
    }
  }
}
```

### 3. It will provide below result
```json
{
  "data": {
    "getCustomer": {
      "customerId": "CUE-sieuryw47e",
      "cif": "87654321",
      "name": " Nilesh",
      "segment": "STAFF",
      "__typename": "Customer",
      "accounts": [
        {
          "id": "ACE-3",
          "number": "98411891891",
          "type": "INVESTMENT",
          "__typename": "Account"
        },
        {
          "id": "ACE-4",
          "number": "65489820926",
          "type": "SAVINGS",
          "__typename": "Account"
        }
      ]
    }
  }
}
```