package com.ququinia.edu.user;

import javax.persistence.*;

@Entity
@Table(name="user")
public class AppUser {

    @Id
    @GeneratedValue(
        strategy=GenerationType.IDENTITY
    )
    private  Integer id;
    
    @Column
    private  String email;

    @Column
    private  String password;
    
    @Column
    private  String username;

   

    public AppUser() {
        
        super();
        this.id = null;
        this.username = null;
        this.password = null;
        this.email = null;
    }

    public AppUser(Integer id, String email, String password, String username) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", password=*** , username=" + username + "]";
    }


    public void setPassword(String pass){
        this.password = pass;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    

    
}
