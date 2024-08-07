package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        readFile();
        try {
            Employee employee = new Employee(1,"Test","test@test.com");
            String jsonString = objectMapper.writeValueAsString(employee);
            System.out.println("JSON Strin: " +jsonString);

            Employee employee1 = objectMapper.readValue(jsonString, Employee.class);
            System.out.println(employee1);

            objectMapper.writeValue(new File("employee.json"),employee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("employee.json");
            Employee employee = objectMapper.readValue(file, Employee.class);
            System.out.println(employee);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}