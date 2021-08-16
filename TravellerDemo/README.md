Simple REST application

REST application that provides REST API.

Run TravellerService locally

Database configuration

1. Create database travellerdemo
Predefined username - sa
Predefined password - sa

Change in properties if required

spring.h2.console.enabled=true
spring.datasource.schema=classpath*:database/sqlDB.sql
spring.datasource.platform=h2
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:D:\\TravellerDemo\\db;DB_CLOSE_DELAY=-1
- database name
spring.datasource.username=sa - username
spring.datasource.password=sa - password
spring.datasource.driverClassName = org.h2.Driver - driver
spring.jpa.database=h2 - database type
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect - dialect


2. git clone 
3. cd TravellerDemo
4. mvn spring-boot:run

5. Access TravellerService using next REST requests:

GET: localhost:9966/api/v1/travellers/ - get all travellers
GET: localhost:9966/api/v1/travellers/1 - get traveller with ID 1

POST: localhost:8088/api/v1/travellers/
Request body:
{
	"user": "Andrei",
	"country": "Portugal",
	"description": "Test",
	"year": "2018"
}

PUT: localhost:8088/api/v1/travellers/
Request body:
{
    "id": 2,
	"user": "Andrei",
	"country": "Portugal",
	"description": "Test",
	"year": "20016"
}


DELETE: localhost:9966/api/v1/travellers/1 - delete traveller with ID 1
