spring-jersey-integration-example
=================================

An example for integrating Spring with Jersey.

Also explains how to serve same data in 2 different formats (XML / JSON).
The content type is determined based on the 'Accept' header.


    'text/xml' => XML
    'application/json' => JSON

By default it will serve XML format.

This example uses Spring 3.2.3.RELEASE version since there is no Jersey extension available for Spring 4.x versions (verified at the time of writing).

## How to run

Execute the below maven command,

    mvn jetty:run

And that's it. We are good to go to test the application. By default jetty uses port 8080.
If you like to use a different port then use the below command,

    mvn jetty:run -Djetty.port=9090

Once the server started, our service must be available on [http://localhost:8080]() (here we are using the default port)

You can terminate the process with a ctrl-c in the terminal window where it is running.


**Note:**
By any means this project doesn't encourage to use Jersey along with Spring. This is just an example explaining how it can be used.
For a new project consider using something like [Dropwizard] (http://www.dropwizard.io/).
If it is an existing Spring based project then consider using [Spring RESTful framework] (https://spring.io/guides/gs/rest-service/).
