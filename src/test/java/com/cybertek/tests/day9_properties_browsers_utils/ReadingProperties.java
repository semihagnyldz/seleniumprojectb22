package com.cybertek.tests.day9_properties_browsers_utils;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_file() throws IOException {
        //1. create object of properties class (coming from java lib)
        Properties properties = new Properties(); //properties is the object but it is empty now
        //2. open the file using FileInputStream
        //we are tyring to open a file, so we need to pass the path

        FileInputStream file= new FileInputStream("configuration.properties");

        //3. load the properties object with our file
        properties.load(file);

        //4. reading from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));


    }

    @Test
    public void using_properties_method(){

        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"env\") = " + ConfigurationReader.getProperty("env"));

    }
}
