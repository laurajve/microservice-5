package com.lauracursojava.microservice5.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
@ToString
public class User {

    @Id
    @Getter @Setter @Column(name= "id")
    private Long id;

    @Getter @Setter @Column(name= "name")
    private String name;

    @Getter @Setter @Column(name= "last_name")
    private String last_name;

    @Getter @Setter @Column(name= "email")
    private String email;

    @Getter @Setter @Column(name= "telephone")
    private String telephone;

    @Getter @Setter @Column(name= "password")
    private String password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
