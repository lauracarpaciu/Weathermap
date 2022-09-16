# Weathermap API

A web service that retrieves weather details (city ID, city name, weather, temperature) from Open Weather Map API:
For more details, please : https://openweathermap.org/api

Method Type: GET

getWeatherDetailsByCityName:

getGroupWeatherDetailsByCityIDs:

The app is structured on the following modules:

Controller module:

a key difference between a traditional MVC controller and the RESTful web service controller is the way that the HTTP response body is created. Rather than relying on a view technology to perform server-side rendering of the data to HTML, this RESTful web service controller populates and returns an object. The object data will be written directly to the HTTP response as JSON. This code uses Spring @RestController annotation, which marks the class as a controller where every method returns a domain object instead of a view. It is shorthand for including both @Controller and @ResponseBody.

DAO module:

contains the dao classes that are used for CRUD operations on the database.(CRUD refers Create, Read, Update, Delete).I need to create a repository that holds user records.

Entity module:

contains the entities classes that are mapped at the database level (ORM).

Service module:

contains the service classes that stores the business logic code of the app:

Spring Boot does not generate code or make edits to your files. Instead, when you start your application, Spring Boot dynamically wires up beans and settings and applies them to your application context.


