package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name="user_table")
@NoArgsConstructor
public class UserDao {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long userId;

    @Column
    private String userName;


    @Column
    @JsonIgnore
    private String password;
/*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_detailsId_ as_fk", referencedColumnName = "id")
    private ProductDetails productDetails;


    @ManyToMany
    @JoinTable(name = "products_units", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "unit_id", referencedColumnName = "id"))
    private Set<Units> units;

    public Product(Long product_id, String product_name, String product_description, ProductDetails productDetails, Set<Units> units) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.productDetails = productDetails;
        this.units = units;
    }
    */

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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


}




