package com.restful.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import java.util.*;
// import org.springframework.stereotype.*;
// import org.springframework.boot.web.server.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// SpringApplication app = new SpringApplication(DemoApplication.class);
        // app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        // app.run(args);
	}

	// @Component
	// public class ServerPortCustomizer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
  
    // @Override
    // public void customize(ConfigurableWebServerFactory factory) {
    //     factory.setPort(8081);
    // }
}

