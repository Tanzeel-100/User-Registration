package com.userRegistration.repository.entities;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "user_data")
public class User {
    @Id
    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userPassword")
    private String userPassword;
}
