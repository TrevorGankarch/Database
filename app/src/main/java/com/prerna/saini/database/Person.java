package com.prerna.saini.database;

/**
 * Created by Dell on 01-Mar-18.
 */

public class Person {
    String name;
    String email;
    String imageUri;

    public Person(String name, String email, String imageUri) {
        this.name = name;
        this.email = email;
        this.imageUri = imageUri;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}