package org.ace58tech;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws LifecycleException, IOException {
        // Create a new instance of Tomcat
        Tomcat tomcat = new Tomcat();
        // Set the port
        tomcat.setPort(8080);
        // Define a base directory for Tomcat to use
        tomcat.setBaseDir("temp");
        // Add a web application context
        String webappDirLocation = "src/main/webapp/WEB-INF/";
        var context = tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());

        // Remove jsp
        context.removeServletMapping("*.jsp");

        System.out.println("Starting tomcat...");

        // Start Tomcat
        tomcat.start();

        // Keep the application running to handle requests
        tomcat.getServer().await();
    }
}