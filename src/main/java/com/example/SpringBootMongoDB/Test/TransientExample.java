package com.example.SpringBootMongoDB.Test;

import java.io.*;

public class TransientExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Serialize the object
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            outputStream.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) inputStream.readObject();
            System.out.println("Deserialized object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//Object serialized successfully.
//Deserialized object: Person{name='Alice', age=0}