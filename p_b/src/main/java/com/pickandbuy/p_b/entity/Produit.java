package com.pickandbuy.p_b.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "produit")
@Data

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idp")
    private long idp;


    @Column(name = "namep")
    private String namep;
    @Column(name = "description")
    private String description;
    @Column(name = "qty")
    private int qty;
    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "idcat", nullable = false)
    private Category category;

}