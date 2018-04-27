/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mine.touristphotobackend.entity;

/**
 *
 * @author joe
 */
public class UserEntity {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public UserEntity(){}
    
    public UserEntity(String username, String password, String fName,String lName, String email){
        this.username = username;
        this.password = password;
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
