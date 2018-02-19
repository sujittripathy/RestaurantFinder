# RestaurantFinder

This is a SpringBoot application to get details around Restaurants such as location, ratings etc..(will be extending to other modules).Application uses 'Zomato' API to get the data and other details relevant to user request.

Application is using Spring Boot 1.5.10 and creating artifact as a self contained jar(aka Uber Jar) and running with in embedded tomcat servlet container contained in Spring Boot.

## How to execute clone and execute the code

* Clone the repo
```
git clone https://github.com/sujittripathy/RestaurantFinder.git
```

* Package the jar
```
mvn package
```

* The artifact jar (RestaurantFinder-0.0.1-SNAPSHOT.jar) has been created in /target folder. To run the application, navigate to cd target and execute as below - 

```
java -jar RestaurantFinder-0.0.1-SNAPSHOT.jar
```

The application will be started and run on port 8080 in localhost.
```
2018-02-19 09:45:43.519  INFO 13584 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers || /loggers.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2018-02-19 09:45:43.520  INFO 13584 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(javax.servlet.http.HttpServletRequest,java.security.Principal)
2018-02-19 09:45:43.970  INFO 13584 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-02-19 09:45:43.999  INFO 13584 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2018-02-19 09:45:44.504  INFO 13584 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2018-02-19 09:45:44.519  INFO 13584 --- [           main] c.e.R.RestaurantFinderApplication        : Started RestaurantFinderApplication in 13.217 seconds (JVM running for 14.862)
```
