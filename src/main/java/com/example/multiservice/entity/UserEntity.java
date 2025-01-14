package com.example.multiservice.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "first_name")
    String first_name;

    @Column(name = "middle_name")
    String middle_name;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "dob")
    LocalDate dob;

    @Column(name = "mobile", unique = true)
    String mobile;

    @Column(name = "email", unique = true)
    String email;

    @Column(name = "password_hash")
    String password_hash;

    @Column(name = "registered_at")
    LocalDateTime registered_at;

    @Column(name = "last_login")
    LocalDateTime last_login;

    @Column(name = "intro")
    String intro;

    @Column(name = "bio")
    String bio;

    @Column(name = "avatar_url")
    String avatar_url;

    @Column(name = "social_links")
    String social_links;

    @Column(name = "active")
    int active;

    //    @OneToMany(mappedBy = "userEntity",fetch = FetchType.LAZY)
    //    List<UserRoleEntity> userRoleEntities;

    @ManyToMany
    List<RoleEntity> roles;


    public boolean isActive() {
        return this.active == 1;
    }
}
