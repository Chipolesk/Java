package org.daniel.introDBA.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
//User é uma palavra reservada do banco H2, por isso dava Syntax Error
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 20, nullable = false)
    private String name;
    @Column(length = 30, nullable = false)
    private String userName;
    @Column(length = 50, nullable = false)
    private String password;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
